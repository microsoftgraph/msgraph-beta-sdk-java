package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserConfiguration extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UserConfiguration} and sets the default values.
     */
    public UserConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static UserConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserConfiguration();
    }
    /**
     * Gets the binaryData property value. Arbitrary binary data.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getBinaryData() {
        return this.backingStore.get("binaryData");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("binaryData", (n) -> { this.setBinaryData(n.getByteArrayValue()); });
        deserializerMap.put("structuredData", (n) -> { this.setStructuredData(n.getCollectionOfObjectValues(StructuredDataEntry::createFromDiscriminatorValue)); });
        deserializerMap.put("xmlData", (n) -> { this.setXmlData(n.getByteArrayValue()); });
        return deserializerMap;
    }
    /**
     * Gets the structuredData property value. Key-value pairs of supported data types.
     * @return a {@link java.util.List<StructuredDataEntry>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<StructuredDataEntry> getStructuredData() {
        return this.backingStore.get("structuredData");
    }
    /**
     * Gets the xmlData property value. Binary data for storing serialized XML.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getXmlData() {
        return this.backingStore.get("xmlData");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("binaryData", this.getBinaryData());
        writer.writeCollectionOfObjectValues("structuredData", this.getStructuredData());
        writer.writeByteArrayValue("xmlData", this.getXmlData());
    }
    /**
     * Sets the binaryData property value. Arbitrary binary data.
     * @param value Value to set for the binaryData property.
     */
    public void setBinaryData(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("binaryData", value);
    }
    /**
     * Sets the structuredData property value. Key-value pairs of supported data types.
     * @param value Value to set for the structuredData property.
     */
    public void setStructuredData(@jakarta.annotation.Nullable final java.util.List<StructuredDataEntry> value) {
        this.backingStore.set("structuredData", value);
    }
    /**
     * Sets the xmlData property value. Binary data for storing serialized XML.
     * @param value Value to set for the xmlData property.
     */
    public void setXmlData(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("xmlData", value);
    }
}
