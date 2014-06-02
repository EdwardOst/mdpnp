/**
 * Copyright 2013, Real-Time Innovations (RTI)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.rti.dds.camel.ice;


import org.apache.camel.spring.Main;

public class CamelIceExample {

    private Main main;

    private CamelIceExample() {
        main = new Main();
    }

    public static void main(String args[]) throws Exception {
        CamelIceExample example = new CamelIceExample();
        example.main.enableHangupSupport();
        example.main.addRouteBuilder(new IceExampleRoutes());
        example.main.run();
    }
}