package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents the details of a bulk Cloud PC relocate action.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcBulkRelocate extends CloudPcBulkAction implements Parsable {
    /**
     * Instantiates a new {@link CloudPcBulkRelocate} and sets the default values.
     */
    public CloudPcBulkRelocate() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcBulkRelocate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcBulkRelocate}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcBulkRelocate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcBulkRelocate();
    }
    /**
     * Gets the domainJoinConfigurations property value. The domain join configurations used when relocating Cloud PCs.
     * @return a {@link java.util.List<CloudPcDomainJoinConfiguration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcDomainJoinConfiguration> getDomainJoinConfigurations() {
        return this.backingStore.get("domainJoinConfigurations");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("domainJoinConfigurations", (n) -> { this.setDomainJoinConfigurations(n.getCollectionOfObjectValues(CloudPcDomainJoinConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("domainJoinConfigurations", this.getDomainJoinConfigurations());
    }
    /**
     * Sets the domainJoinConfigurations property value. The domain join configurations used when relocating Cloud PCs.
     * @param value Value to set for the domainJoinConfigurations property.
     */
    public void setDomainJoinConfigurations(@jakarta.annotation.Nullable final java.util.List<CloudPcDomainJoinConfiguration> value) {
        this.backingStore.set("domainJoinConfigurations", value);
    }
}
