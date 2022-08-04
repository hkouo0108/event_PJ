package org.zerock.anno;

import javax.servlet.http.HttpSession;

import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import lombok.RequiredArgsConstructor;


@Component
@RequiredArgsConstructor
public class LogincheckArgumentResolver implements HandlerMethodArgumentResolver {

	private final HttpSession httpSession;
	
	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		boolean isLogincheckAnnotation = parameter.getParameterAnnotation(Logincheck.class) != null;
		
		//boolean isLoginClass = SessionUser.class.equals(parameter.getParameterType());
		
		//return isLogincheckAnnotation && isLoginClass;
		return true;
	}

	@Override
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
			NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
		
		return httpSession.getAttribute("user");
	}

}
