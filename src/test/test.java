package test;

import java.io.UnsupportedEncodingException;

import org.apache.mina.core.buffer.IoBuffer;

public class test {

	public static IoBuffer stringToIoBuffer(String str)   
	{   
	       byte bt[] = str.getBytes();   
	       IoBuffer ioBuffer = IoBuffer.allocate(bt.length);   
	       ioBuffer.put(bt, 0, bt.length);   
	       ioBuffer.flip();   
	       return ioBuffer;   
	}   
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		IoBuffer in;
		String msg = "KFXAG1400000250<Message><root><name>asdf1</name></root></Message>";
		System.out.println(msg.length());
		in = stringToIoBuffer(msg);
//		in.limit(19);
		in.mark();
//		in.limit(5);
		byte[] bytemsg = new byte[6];
		in.get(bytemsg);
		String mmm = new String(bytemsg,"UTF-8");
		System.out.println(mmm);
		byte[] bytemsg1 = new byte[9];
		in.get(bytemsg1);
		String mmm1 = new String(bytemsg1,"UTF-8");
		System.out.println(mmm1);
		System.out.println(in.remaining());
		in.reset();
		in.position(4);
		byte[] msglen = new byte[60];
		in.get(msglen);
		String mmssgg = new String(msglen,"UTF-8");
		System.out.println(mmssgg);
	}
}
