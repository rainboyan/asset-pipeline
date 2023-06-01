/*
* Copyright 2014-2023 the original author or authors.
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
*/

package asset.pipeline.gradle

/**
 * Allows configuration of the Gradle plugin
 *
 * @author David Estes
 * @author Graeme Rocher
 */
interface AssetPipelineExtension {

    boolean getMinifyJs()
    void setMinifyJs(boolean value)

    boolean getEnableSourceMaps()
    void setEnableSourceMaps(boolean value)

    boolean getMinifyCss()
    void setMinifyCss(boolean value)

    boolean getEnableDigests()
    void setEnableDigests(boolean value)

    boolean getSkipNonDigests()
    void setSkipNonDigests(boolean value)

    boolean getEnableGzip()
    void setEnableGzip(boolean value)

    boolean getPackagePlugin()
    void setPackagePlugin(boolean value)

    boolean getDevelopmentRuntime()
    void setDevelopmentRuntime(boolean value)

    boolean getVerbose()
    void setVerbose(boolean value)

    Integer getMaxThreads()
    void setMaxThreads(Integer value)

    String getCompileDir()
    void setCompileDir(String value)

    String getAssetsPath()
    void setAssetsPath(String value)

	String getJarTaskName()
    void setJarTaskName(String value)

    Map getMinifyOptions()
    void setMinifyOptions(Map value)

    Map getConfigOptions()
    void setConfigOptions(Map value)


    List getExcludesGzip()
    void setExcludesGzip(List value)

    List getExcludes()
    void setExcludes(List value)

    List getIncludes()
    void setIncludes(List value)

    List<String> getResolvers()
    void setResolvers(List<String> value)

}
