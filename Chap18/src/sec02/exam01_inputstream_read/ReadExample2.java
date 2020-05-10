package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[3];
//		while((readByteNo = is.read(readBytes)) != -1) {
//			System.out.println(readByteNo);
//		}

		String data = "";
		while (true) {
			readByteNo = is.read(readBytes);
			if (readByteNo == -1) {
				break;
			} else {
				System.out.println(readByteNo);
				data = new String(readBytes, 0, readByteNo);
				System.out.println(data);
			}
		}
	}
}
