/*package hu.helixlab.security;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Order(Ordered.HIGHEST_PRECEDENCE)
@Component
public class CORSFilter implements Filter {

	//private final static Logger LOGGER = Logger.getLogger(Filter.class.getName());

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		httpResponse.setHeader("Access-Control-Allow-Origin", "http://localhost:8080, http://localhost:8081");

		httpResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
		httpResponse.setHeader("Access-Control-Allow-Headers", "X-Auth-Token, Content-Type");
		httpResponse.setHeader("Access-Control-Expose-Headers", "custom-header1, custom-header2");
		httpResponse.setHeader("Access-Control-Allow-Credentials", "false");
		httpResponse.setHeader("Access-Control-Max-Age", "4800");
		System.out.println("****************CORS Configuration Completed---");
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void destroy() {
	}
}*/