//package C09ServerSocket;
//
//public class test {
//    public static void main(String[] args) {
//
//        while(true){
//            Socket socket = serverSocket.accept();
//            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            StringBuilder sb = new StringBuilder();
//            String line;
//            while((line=br.readLine()) != null && !line.isEmpty()){
//                sb.append(line+"\n");
//            }
//            String firstLine = sb.toString().split("\n")[0];
//            String infos = firstLine.split(" ")[1];
//
//            String id="";
//            String name="";
//            String email="";
//            //파라미터가 존재하면
//            if(infos.contains("?")){
//                String str = infos.split("\?")[1];
//                String[] parameters = str.split("&");
//                for(String p : parameters){
//                    String key = p.split("=")[0];
//                    String myQuery = "";
//                    if(key.equals("id"))
//                        id = p.split("=")[1];
//                    if(key.equals("name"))
//                        name = p.split("=")[1];
//                    if(key.equals("email"))
//                        email = p.split("=")[1];
//                }
//                String myQuery ="";
//                if(!id.isEmpty()){
//                    myQuery = "select * from author where id = " + id;
//                }
//                else{
//                    System.out.println("test");
//                    myQuery = "select * from author where name=" + name + " and email="+email;
//                }
//
//                ResultSet rs = st1.executeQuery(myQuery);
//                while(rs.next()){
//                    System.out.print("name : "+rs.getString("name")+ ", email : "+rs.getString("email")+ ", password : "+rs.getString("password"));
//
//                }
//
//            }
//
//
////            System.out.println(sb);
//        }
//
//    }
//}
