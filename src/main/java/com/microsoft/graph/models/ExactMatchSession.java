package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExactMatchSession extends ExactMatchSessionBase implements Parsable {
    /** The checksum property */
    private String _checksum;
    /** The dataUploadURI property */
    private String _dataUploadURI;
    /** The fields property */
    private java.util.List<String> _fields;
    /** The fileName property */
    private String _fileName;
    /** The rowsPerBlock property */
    private Integer _rowsPerBlock;
    /** The salt property */
    private String _salt;
    /** The uploadAgent property */
    private ExactMatchUploadAgent _uploadAgent;
    /** The uploadAgentId property */
    private String _uploadAgentId;
    /**
     * Instantiates a new ExactMatchSession and sets the default values.
     * @return a void
     */
    public ExactMatchSession() {
        super();
        this.setOdataType("#microsoft.graph.exactMatchSession");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExactMatchSession
     */
    @javax.annotation.Nonnull
    public static ExactMatchSession createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExactMatchSession();
    }
    /**
     * Gets the checksum property value. The checksum property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getChecksum() {
        return this._checksum;
    }
    /**
     * Gets the dataUploadURI property value. The dataUploadURI property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDataUploadURI() {
        return this._dataUploadURI;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ExactMatchSession currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("checksum", (n) -> { currentObject.setChecksum(n.getStringValue()); });
            this.put("dataUploadURI", (n) -> { currentObject.setDataUploadURI(n.getStringValue()); });
            this.put("fields", (n) -> { currentObject.setFields(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("fileName", (n) -> { currentObject.setFileName(n.getStringValue()); });
            this.put("rowsPerBlock", (n) -> { currentObject.setRowsPerBlock(n.getIntegerValue()); });
            this.put("salt", (n) -> { currentObject.setSalt(n.getStringValue()); });
            this.put("uploadAgent", (n) -> { currentObject.setUploadAgent(n.getObjectValue(ExactMatchUploadAgent::createFromDiscriminatorValue)); });
            this.put("uploadAgentId", (n) -> { currentObject.setUploadAgentId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the fields property value. The fields property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getFields() {
        return this._fields;
    }
    /**
     * Gets the fileName property value. The fileName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileName() {
        return this._fileName;
    }
    /**
     * Gets the rowsPerBlock property value. The rowsPerBlock property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRowsPerBlock() {
        return this._rowsPerBlock;
    }
    /**
     * Gets the salt property value. The salt property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSalt() {
        return this._salt;
    }
    /**
     * Gets the uploadAgent property value. The uploadAgent property
     * @return a exactMatchUploadAgent
     */
    @javax.annotation.Nullable
    public ExactMatchUploadAgent getUploadAgent() {
        return this._uploadAgent;
    }
    /**
     * Gets the uploadAgentId property value. The uploadAgentId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUploadAgentId() {
        return this._uploadAgentId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("checksum", this.getChecksum());
        writer.writeStringValue("dataUploadURI", this.getDataUploadURI());
        writer.writeCollectionOfPrimitiveValues("fields", this.getFields());
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeIntegerValue("rowsPerBlock", this.getRowsPerBlock());
        writer.writeStringValue("salt", this.getSalt());
        writer.writeObjectValue("uploadAgent", this.getUploadAgent());
        writer.writeStringValue("uploadAgentId", this.getUploadAgentId());
    }
    /**
     * Sets the checksum property value. The checksum property
     * @param value Value to set for the checksum property.
     * @return a void
     */
    public void setChecksum(@javax.annotation.Nullable final String value) {
        this._checksum = value;
    }
    /**
     * Sets the dataUploadURI property value. The dataUploadURI property
     * @param value Value to set for the dataUploadURI property.
     * @return a void
     */
    public void setDataUploadURI(@javax.annotation.Nullable final String value) {
        this._dataUploadURI = value;
    }
    /**
     * Sets the fields property value. The fields property
     * @param value Value to set for the fields property.
     * @return a void
     */
    public void setFields(@javax.annotation.Nullable final java.util.List<String> value) {
        this._fields = value;
    }
    /**
     * Sets the fileName property value. The fileName property
     * @param value Value to set for the fileName property.
     * @return a void
     */
    public void setFileName(@javax.annotation.Nullable final String value) {
        this._fileName = value;
    }
    /**
     * Sets the rowsPerBlock property value. The rowsPerBlock property
     * @param value Value to set for the rowsPerBlock property.
     * @return a void
     */
    public void setRowsPerBlock(@javax.annotation.Nullable final Integer value) {
        this._rowsPerBlock = value;
    }
    /**
     * Sets the salt property value. The salt property
     * @param value Value to set for the salt property.
     * @return a void
     */
    public void setSalt(@javax.annotation.Nullable final String value) {
        this._salt = value;
    }
    /**
     * Sets the uploadAgent property value. The uploadAgent property
     * @param value Value to set for the uploadAgent property.
     * @return a void
     */
    public void setUploadAgent(@javax.annotation.Nullable final ExactMatchUploadAgent value) {
        this._uploadAgent = value;
    }
    /**
     * Sets the uploadAgentId property value. The uploadAgentId property
     * @param value Value to set for the uploadAgentId property.
     * @return a void
     */
    public void setUploadAgentId(@javax.annotation.Nullable final String value) {
        this._uploadAgentId = value;
    }
}
