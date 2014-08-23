/*************************GO-LICENSE-START*********************************
 * Copyright 2014 ThoughtWorks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *************************GO-LICENSE-END***********************************/

package com.thoughtworks.go.config.materials.github;

import com.thoughtworks.go.config.CaseInsensitiveString;
import com.thoughtworks.go.config.ConfigAttribute;
import com.thoughtworks.go.config.ConfigTag;
import com.thoughtworks.go.config.ValidationContext;
import com.thoughtworks.go.config.materials.Filter;
import com.thoughtworks.go.config.materials.ScmMaterialConfig;
import com.thoughtworks.go.domain.ConfigErrors;
import com.thoughtworks.go.util.command.UrlArgument;

import java.util.Map;

@ConfigTag("git")
public class GithubMaterialConfig extends ScmMaterialConfig {

    @ConfigAttribute(value = "url")
    private UrlArgument url;

    @ConfigAttribute(value = "branch")
    private String branch = DEFAULT_BRANCH;

    private String submoduleFolder;

    public static final String TYPE = "GithubMaterial";
    public static final String URL = "url";
    public static final String BRANCH = "branch";
    public static final String DEFAULT_BRANCH = "master";

    private GithubMaterialConfig() {
        super(TYPE);
    }

    public GithubMaterialConfig(String url) {
        super(TYPE);
        this.url = new UrlArgument(url);
    }

    public GithubMaterialConfig(String url, String branch) {
        this(url);
        if (branch != null) {
            this.branch = branch;
        }
    }

    public GithubMaterialConfig(UrlArgument url, String branch, String submoduleFolder, boolean autoUpdate, Filter filter, String folder, CaseInsensitiveString name) {
        super(name, filter, folder, autoUpdate, TYPE, new ConfigErrors());
        this.url = url;
        this.branch = branch;
        this.submoduleFolder = submoduleFolder;
    }

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getEncryptedPassword() {
        return null;
    }

    @Override
    public boolean isCheckExternals() {
        return false;
    }

    @Override
    public String getUrl() {
        return null;
    }

    @Override
    protected UrlArgument getUrlArgument() {
        return null;
    }

    @Override
    protected String getLocation() {
        return null;
    }

    @Override
    protected void validateConcreteScmMaterial(ValidationContext validationContext) {

    }

    @Override
    protected void appendCriteria(Map<String, Object> parameters) {

    }

    @Override
    protected void appendAttributes(Map<String, Object> parameters) {

    }

    @Override
    public String getTypeForDisplay() {
        return null;
    }

    @Override
    public String getLongDescription() {
        return null;
    }
}
