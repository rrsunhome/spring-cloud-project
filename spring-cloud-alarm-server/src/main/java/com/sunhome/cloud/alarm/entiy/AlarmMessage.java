/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
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

package com.sunhome.cloud.alarm.entiy;

/**
 * 详细见
 * https://github.com/apache/skywalking/blob/master/docs/en/setup/backend/backend-alarm.md#rules
 * 源码见RunningRule->142行
 */
public class AlarmMessage {
    /**
     * 范围 ID->作用域
     */
    private int scopeId;
    /**
     * 范围名称->作用域
     */
    private String scope;
    /**
     * 目标范围实体名称
     */
    private String name;
    /**
     * 作用域实体的ID，与名称匹配
     */
    private int id0;
    /**
     * 官方未用
     */
    private int id1;
    /**
     * 规则名_Rule后缀的
     */
    private String ruleName;
    /**
     * 告警消息->alarm-settings.yml见配置文件
     */
    private String alarmMessage;
    /**
     * 发送告警服务端当前时间
     */
    private long startTime;

    public int getScopeId() {
        return scopeId;
    }

    public void setScopeId(int scopeId) {
        this.scopeId = scopeId;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId0() {
        return id0;
    }

    public void setId0(int id0) {
        this.id0 = id0;
    }

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getAlarmMessage() {
        return alarmMessage;
    }

    public void setAlarmMessage(String alarmMessage) {
        this.alarmMessage = alarmMessage;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
}
