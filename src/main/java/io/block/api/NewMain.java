/*
 * The MIT License
 *
 * Copyright 2020 stano.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package io.block.api;

import io.block.api.utils.BlockIOException;
import io.block.api.utils.SigningUtils;

/**
 *
 * @author stano
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws BlockIOException {
        BlockIO blockIO = new BlockIO("dsafadf");
        
        String signature = SigningUtils.signData(
                "695369676e65645468697344617461546861744973323536426974734c6f6e67", 
                SigningUtils.fromHex("7a01628988d23fae697fa05fcdae5a82fe4f749aa9f24d35d23f81bee917dfc3"));
        
        System.out.println("Signature: " + signature);
    }
    
}
