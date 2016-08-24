/*
 * Copyright 2014 astamuse company,Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package com.assignmentone.util.persondb;

import java.util.LinkedList;
import java.util.List;

public class EducationDbManager extends AbstractDbManager<Education> {
    private static EducationDbManager instance = new EducationDbManager();

    private EducationDbManager() {
        super();
    }

    public static EducationDbManager instance() {
        return instance;
    }

    protected List<Education> initEntityList() {
        return new LinkedList<>();
    }

}