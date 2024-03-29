package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExactMatchSession extends ExactMatchSessionBase implements Parsable {
    /**
     * Instantiates a new {@link ExactMatchSession} and sets the default values.
     */
    public ExactMatchSession() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExactMatchSession}
     */
    @jakarta.annotation.Nonnull
    public static ExactMatchSession createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExactMatchSession();
    }
    /**
     * Gets the checksum property value. The checksum property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChecksum() {
        return this.backingStore.get("checksum");
    }
    /**
     * Gets the dataUploadURI property value. The dataUploadURI property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDataUploadURI() {
        return this.backingStore.get("dataUploadURI");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("checksum", (n) -> { this.setChecksum(n.getStringValue()); });
        deserializerMap.put("dataUploadURI", (n) -> { this.setDataUploadURI(n.getStringValue()); });
        deserializerMap.put("fields", (n) -> { this.setFields(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("rowsPerBlock", (n) -> { this.setRowsPerBlock(n.getIntegerValue()); });
        deserializerMap.put("salt", (n) -> { this.setSalt(n.getStringValue()); });
        deserializerMap.put("uploadAgent", (n) -> { this.setUploadAgent(n.getObjectValue(ExactMatchUploadAgent::createFromDiscriminatorValue)); });
        deserializerMap.put("uploadAgentId", (n) -> { this.setUploadAgentId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fields property value. The fields property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getFields() {
        return this.backingStore.get("fields");
    }
    /**
     * Gets the fileName property value. The fileName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.backingStore.get("fileName");
    }
    /**
     * Gets the rowsPerBlock property value. The rowsPerBlock property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRowsPerBlock() {
        return this.backingStore.get("rowsPerBlock");
    }
    /**
     * Gets the salt property value. The salt property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSalt() {
        return this.backingStore.get("salt");
    }
    /**
     * Gets the uploadAgent property value. The uploadAgent property
     * @return a {@link ExactMatchUploadAgent}
     */
    @jakarta.annotation.Nullable
    public ExactMatchUploadAgent getUploadAgent() {
        return this.backingStore.get("uploadAgent");
    }
    /**
     * Gets the uploadAgentId property value. The uploadAgentId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUploadAgentId() {
        return this.backingStore.get("uploadAgentId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setChecksum(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("checksum", value);
    }
    /**
     * Sets the dataUploadURI property value. The dataUploadURI property
     * @param value Value to set for the dataUploadURI property.
     */
    public void setDataUploadURI(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("dataUploadURI", value);
    }
    /**
     * Sets the fields property value. The fields property
     * @param value Value to set for the fields property.
     */
    public void setFields(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("fields", value);
    }
    /**
     * Sets the fileName property value. The fileName property
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileName", value);
    }
    /**
     * Sets the rowsPerBlock property value. The rowsPerBlock property
     * @param value Value to set for the rowsPerBlock property.
     */
    public void setRowsPerBlock(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("rowsPerBlock", value);
    }
    /**
     * Sets the salt property value. The salt property
     * @param value Value to set for the salt property.
     */
    public void setSalt(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("salt", value);
    }
    /**
     * Sets the uploadAgent property value. The uploadAgent property
     * @param value Value to set for the uploadAgent property.
     */
    public void setUploadAgent(@jakarta.annotation.Nullable final ExactMatchUploadAgent value) {
        this.backingStore.set("uploadAgent", value);
    }
    /**
     * Sets the uploadAgentId property value. The uploadAgentId property
     * @param value Value to set for the uploadAgentId property.
     */
    public void setUploadAgentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("uploadAgentId", value);
    }
}
