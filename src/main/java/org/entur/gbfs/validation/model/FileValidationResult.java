/*
 *
 *
 *  * Licensed under the EUPL, Version 1.2 or – as soon they will be approved by
 *  * the European Commission - subsequent versions of the EUPL (the "Licence");
 *  * You may not use this work except in compliance with the Licence.
 *  * You may obtain a copy of the Licence at:
 *  *
 *  *   https://joinup.ec.europa.eu/software/page/eupl
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the Licence is distributed on an "AS IS" basis,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the Licence for the specific language governing permissions and
 *  * limitations under the Licence.
 *
 */

package org.entur.gbfs.validation.model;

import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class FileValidationResult implements ValidationResultComponentIdentity<FileValidationResult> {
    private String file;
    private boolean required;
    private boolean exists;
    private int errorsCount;
    private String schema;
    private String fileContents;
    private String version;
    private List<FileValidationError> errors;

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }

    public int getErrorsCount() {
        return errorsCount;
    }

    public void setErrorsCount(int errorsCount) {
        this.errorsCount = errorsCount;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getFileContents() {
        return fileContents;
    }

    public void setFileContents(String fileContents) {
        this.fileContents = fileContents;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<FileValidationError> getErrors() {
        return errors;
    }

    public void setErrors(List<FileValidationError> errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "FileValidationResult{" +
                "file='" + file + '\'' +
                ", required=" + required +
                ", exists=" + exists +
                ", errorsCount=" + errorsCount +
                ", schema='" + schema + '\'' +
                ", fileContents='" + fileContents + '\'' +
                ", version='" + version + '\'' +
                ", errors=" + errors +
                '}';
    }

    @Override
    public boolean sameAs(FileValidationResult other) {
        if (other == null) return false;
        if (required != other.required) return false;
        if (exists != other.exists) return false;
        if (errorsCount != other.errorsCount) return false;
        if (!Objects.equals(file, other.file)) return false;
        if (!Objects.equals(version, other.version)) return false;
        return IntStream
                .range(0, errors.size())
                .allMatch(i -> errors.get(i).sameAs(other.errors.get(i)));
    }
}
