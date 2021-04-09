package chatting.step3.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 키보드로 데이터를 읽어들여서
 * 서버로 보낸다.
 * ---------------------------------
 * 다시 서버가 보낸 메시지를 읽어서
 * 클라이언트 자신의 콘솔창에 메세지를 출력
 */
public class ChattClient {
	// 필드 선언
	Socket s;
	BufferedReader br, br1;
	PrintWriter pw;

	// Stream
	public void net() {
		try {
			s = new Socket("127.0.0.1", 60000);
			System.out.println("Socket Creating...");

			br = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(s.getOutputStream(), true);
			
			//서버가 보낸 메세지만 읽어들이는 작업을 전담하는 쓰레드를 생성
			ClientThread st = new ClientThread
					
			System.out.println("Client Stream Creating...");
			while (true) {
				String line = br.readLine();// 키보드로 입력받은 데이터를 읽어서
				pw.println(line);// 서버로 보낸다.
				/////// Blocking//////////
				String serverMsg = br1.readLine();
				System.out.println("서버가 보낸 메세지 " + serverMsg);
			}

		} catch (Exception e) {
			System.out.println("서버와의 연결이 끊어졌습니다.");
		} finally {
			try {
				br.close();
				pw.close();
				br.close();

			} catch (IOException e) {

			}

		}
	}

	public static void main(String[] args) {
		ChattClient cc = new ChattClient();
		cc.net();

	}

}
class ClientThread extends Thread{
	Socket s;
	BufferedReader br1;
	
	Clientthread(Socket s){
		this.s = s;
	}
	
	public void run() {
		try {
			br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			while(true) {
				String str = br1
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
