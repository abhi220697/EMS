package com.demo.EMS.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Abhishek Raj
 */

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ResponseMsg {

    /** The isSuccess. */
    private String status;

    /** The result. */
    private Object data;

    /** The response message. */
    private String message;

}

