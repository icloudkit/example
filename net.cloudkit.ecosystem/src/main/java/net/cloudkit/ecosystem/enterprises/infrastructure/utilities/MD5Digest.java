package net.cloudkit.ecosystem.enterprises.infrastructure.utilities;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5 encrypt
 * 
 * @author hongquanli <hongquanli@qq.com>
 * @version 1.0 2011-12-12 下午4:00:24
 */
public class MD5Digest {

	private static final String hexDigits[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

	private static String byteArrayToHexString(byte b[]) {
		StringBuffer resultSb = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			resultSb.append(byteToHexString(b[i]));
		}
		return resultSb.toString();
	}

	private static String byteToHexString(byte b) {
		int n = b;
		if (n < 0)
			n += 256;
		int d1 = n / 16;
		int d2 = n % 16;
		return hexDigits[d1] + hexDigits[d2];
	}

	/**
	 * encode origin
	 * 
	 * @param origin <param,charset>
	 * @return
	 * @throws EncoderException
	 */
	public static String encode(String... origin) throws EncoderException {
		String resultString = null;
		try {
			resultString = new String(origin[0]);
			MessageDigest md = MessageDigest.getInstance("MD5");
			if (origin.length < 2) {
				resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
			} else {
				resultString = byteArrayToHexString(md.digest(resultString.getBytes(origin[1])));
			}
		} catch (NoSuchAlgorithmException e) {
			// ex.printStackTrace();
			throw new EncoderException("No Such Algorithm Exception" + e.getMessage());
		} catch (UnsupportedEncodingException e) {
			// e.printStackTrace();
			throw new EncoderException("Unsupported Encoding Exception" + e.getMessage());
		}
		return resultString;
	}

	public MD5Digest() {
	}

	// @Test
	// public void test() {
	// try {
	// System.out.println(MD5Digest.encode("coffee", "utf-8").toLowerCase());
	// } catch (EncoderException e) {
	// e.printStackTrace();
	// }
	// }
}