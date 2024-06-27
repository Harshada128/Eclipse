package com.learn.practiceexam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

public class Quetion13 {
	public static void main(String[] args) {
		byte[] b = new byte[256];
		try (FileInputStream fis = new FileInputStream(args[0]); 
				FileOutputStream fos = new FileOutputStream(args[1])) {
			int count = 0;
			int read = 0;
			while ((read = fis.read(b)) != -1) {
				fos.write(b);
				count += read;
			}
			System.out.println("Output: " + count);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
