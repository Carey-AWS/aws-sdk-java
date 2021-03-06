/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

/**
 * <p>
 * The transactional data APIs for Amazon QLDB
 * </p>
 * <note>
 * <p>
 * Instead of interacting directly with this API, we recommend that you use the Amazon QLDB Driver or the QLDB Shell to
 * execute data transactions on a ledger.
 * </p>
 * <ul>
 * <li>
 * <p>
 * If you are working with an AWS SDK, use the QLDB Driver. The driver provides a high-level abstraction layer above
 * this <code>qldbsession</code> data plane and manages <code>SendCommand</code> API calls for you. For information and
 * a list of supported programming languages, see <a
 * href="https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started-driver.html">Getting started with the
 * driver</a> in the <i>Amazon QLDB Developer Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you are working with the AWS Command Line Interface (AWS CLI), use the QLDB Shell. The shell is a command line
 * interface that uses the QLDB Driver to interact with a ledger. For information, see <a
 * href="https://docs.aws.amazon.com/qldb/latest/developerguide/data-shell.html">Accessing Amazon QLDB using the QLDB
 * Shell</a>.
 * </p>
 * </li>
 * </ul>
 * </note>
 */
package com.amazonaws.services.qldbsession;

