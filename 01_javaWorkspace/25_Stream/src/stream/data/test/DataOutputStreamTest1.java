package stream.data.test;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ������ �������� ���Ϸ� ����ϴ� �ڵ带 �ۼ�
 * ���࿡ score.dat ���� ������ �������� �ʾƼ� ��µǴ� �����޼����� ����...
 * ����Ʈ �迭 ��Ʈ���� ��µǴ� ������ ������ ���ڱ���� �ƴ�, Binary Data(���� ������)�̱⿡
 * ����������� ���Ƶ� �˼� �������� ������.
 * �׷��� �ᱹ �̸� Ȯ���ϱ� ���ؼ��� 
 * score.dat���Ͽ� ��µ� Binary Data�� �ٽ� DataInputStream�� ���ؼ� �ڹ� �⺻��(int)���� �ڵ���ȯ���Ѽ� �о�鿩�� �Ѵ�.
 * 
 */
public class DataOutputStreamTest1 {

	public static void main(String[] args) throws IOException {
		int[] scores = {100,90,70,75,65};
		String outFile = "src\\scores.dat";
		//1.
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
		
		System.out.println("scores.dat ������ �����Ǿ����ϴ�...");
		
		//2. �迭�ȿ� ����ִ� ������ ������ ���Ϸ� ���..writeInt()
		for(int score :  scores) dos.writeInt(score);
	}

}