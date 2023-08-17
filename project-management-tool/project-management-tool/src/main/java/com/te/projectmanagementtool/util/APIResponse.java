package com.te.projectmanagementtool.util;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class APIResponse {

	private Object data;

	private boolean error;

	private String message;
}
