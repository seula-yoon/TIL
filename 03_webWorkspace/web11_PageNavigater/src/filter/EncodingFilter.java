package filter;
/*
 * ?΄?Ό?΄?Έ?Έλ‘λ??° ?€?΄?€? ?μ²?? κ°?λ‘μ±?΄?
 * ?Έμ½λ© ??? ??°λ§μΌλ‘? ?°κ²°ν?€.
 * ?΄? ??° ?·λΆ?λΆμ ??€? λͺ¨λ  μ»΄ν¬??Έ?€?? ?¬κΈ°μ ??? ??°λ§? ??? ?¨κ³Όλ?? ?»κ²? ??€.
 * 
 */
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(
		value = {"/*"}
		)
public class EncodingFilter implements Filter {

    public EncodingFilter() {
       
    }
    
	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		//?λ°©ν₯ ?κΈ?μ²λ¦¬
		request.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html;charset=utf-8");
		//?λ²μ? ?€? μ»΄ν¬??Έ?κ²? κ³μ ??°λ§ν ???΄ ?°κ²°λ?λ‘? ?κΈ? ?? ??...λ°λ? ??΄?Ό ??€.
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
