URL
http://host:port/day1.1/hello
path / URI
/day1.1/hello 
url pattern
/hello

WC creates an empty map @ web app dep time
key : url pattern (eg : /hello)
value : F.Q servlet cls name (eg : pages.HelloWorldServlet) -- extending from HttpServlet

Problem :
What happened when client clicks on the link ?
Web clnt sends URL
http://host:port/day1.1/hello 
Webserver --> WC
searches in the map , is there a key /hello ???? NO
so rets null(value) --> no mapping found --> HTTP 404 (page not found) resp sent 
Solution : Add URL mapping entry in WC's map
How to give instructions to WC ?
1. XML tags (legacy)
OR 
2. Annotations (run time instr meant for WC)
pkg : javax.servlet.annotation
eg : 
@WebServlet("/hello")
public class HelloWorldServlet extends H.S {...}
Who : WC
When : @ dep time
What : WC adds the entry in the URL map
key : /hello
value : pages.HelloWorldServlet 


























