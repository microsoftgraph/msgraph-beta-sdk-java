package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class StandardWebPart extends WebPart implements Parsable {
    /**
     * The instance identifier of the container text webPart. It only works for inline standard webPart in rich text webParts.
     */
    private String containerTextWebPartId;
    /**
     * Data of the webPart.
     */
    private WebPartData data;
    /**
     * A Guid that indicates the webPart type.
     */
    private String webPartType;
    /**
     * Instantiates a new standardWebPart and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public StandardWebPart() {
        super();
        this.setOdataType("#microsoft.graph.standardWebPart");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a standardWebPart
     */
    @javax.annotation.Nonnull
    public static StandardWebPart createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StandardWebPart();
    }
    /**
     * Gets the containerTextWebPartId property value. The instance identifier of the container text webPart. It only works for inline standard webPart in rich text webParts.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContainerTextWebPartId() {
        return this.containerTextWebPartId;
    }
    /**
     * Gets the data property value. Data of the webPart.
     * @return a webPartData
     */
    @javax.annotation.Nullable
    public WebPartData getData() {
        return this.data;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("containerTextWebPartId", (n) -> { this.setContainerTextWebPartId(n.getStringValue()); });
        deserializerMap.put("data", (n) -> { this.setData(n.getObjectValue(WebPartData::createFromDiscriminatorValue)); });
        deserializerMap.put("webPartType", (n) -> { this.setWebPartType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the webPartType property value. A Guid that indicates the webPart type.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebPartType() {
        return this.webPartType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("containerTextWebPartId", this.getContainerTextWebPartId());
        writer.writeObjectValue("data", this.getData());
        writer.writeStringValue("webPartType", this.getWebPartType());
    }
    /**
     * Sets the containerTextWebPartId property value. The instance identifier of the container text webPart. It only works for inline standard webPart in rich text webParts.
     * @param value Value to set for the containerTextWebPartId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContainerTextWebPartId(@javax.annotation.Nullable final String value) {
        this.containerTextWebPartId = value;
    }
    /**
     * Sets the data property value. Data of the webPart.
     * @param value Value to set for the data property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setData(@javax.annotation.Nullable final WebPartData value) {
        this.data = value;
    }
    /**
     * Sets the webPartType property value. A Guid that indicates the webPart type.
     * @param value Value to set for the webPartType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebPartType(@javax.annotation.Nullable final String value) {
        this.webPartType = value;
    }
}
