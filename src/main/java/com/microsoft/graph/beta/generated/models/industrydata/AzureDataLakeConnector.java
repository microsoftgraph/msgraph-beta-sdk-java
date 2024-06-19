package com.microsoft.graph.beta.models.industrydata;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AzureDataLakeConnector extends FileDataConnector implements Parsable {
    /**
     * Instantiates a new {@link AzureDataLakeConnector} and sets the default values.
     */
    public AzureDataLakeConnector() {
        super();
        this.setOdataType("#microsoft.graph.industryData.azureDataLakeConnector");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AzureDataLakeConnector}
     */
    @jakarta.annotation.Nonnull
    public static AzureDataLakeConnector createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureDataLakeConnector();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fileFormat", (n) -> { this.setFileFormat(n.getObjectValue(FileFormatReferenceValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fileFormat property value. The file format that external systems can upload using this connector.
     * @return a {@link FileFormatReferenceValue}
     */
    @jakarta.annotation.Nullable
    public FileFormatReferenceValue getFileFormat() {
        return this.backingStore.get("fileFormat");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("fileFormat", this.getFileFormat());
    }
    /**
     * Sets the fileFormat property value. The file format that external systems can upload using this connector.
     * @param value Value to set for the fileFormat property.
     */
    public void setFileFormat(@jakarta.annotation.Nullable final FileFormatReferenceValue value) {
        this.backingStore.set("fileFormat", value);
    }
}
