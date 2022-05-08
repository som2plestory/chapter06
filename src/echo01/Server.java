package echo01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
 
public class Server {
	
	//ServerSocket : 클라이언트의 연결요청을 기다리면서 연결 요청에 대한 수락을 담당
	//Socket : 클라이언트와 통신을 직접 담당
	
	// 서버소켓객체생성 > bind > accept > 소켓객체생성 > read > write > close
	
	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("119.195.181.210", 10001));	//외우세요 외워(ip, port)
		//cmd 창에서 ipconfig 검색> IPv4 주소
		
		System.out.println("<서버시작>");
		System.out.println("============================================");
		System.out.println("[연결을 기다리고 있습니다.]");
		
		Socket socket = serverSocket.accept();	//다이렉트 연결 / accept : 연결허락
		System.out.println("[클라이언트가 연결 되었습니다.]");
		
		//메세지 받기용 스트림
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		//메세지 보내기용 스트림
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		//
		while(true) {
			//메세지 받기
			String msg = br.readLine();
			
			if(msg == null) {
				break;
			}
			
			System.out.println("받은 메세지:" + msg);

			//메세지 보내기
			bw.write(msg);
			bw.newLine();
			bw.flush();
			
		}
		
		
		
		System.out.println("============================================");
		System.out.println("<서버종료>");
		
		br.close();
		socket.close();
		serverSocket.close();
	}  

}
