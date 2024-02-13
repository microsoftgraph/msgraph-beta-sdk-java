package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcCrossCloudGovernmentOrganizationMapping extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcCrossCloudGovernmentOrganizationMapping} and sets the default values.
     */
    public CloudPcCrossCloudGovernmentOrganizationMapping() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcCrossCloudGovernmentOrganizationMapping}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcCrossCloudGovernmentOrganizationMapping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcCrossCloudGovernmentOrganizationMapping();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("organizationIdsInUSGovCloud", (n) -> { this.setOrganizationIdsInUSGovCloud(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the organizationIdsInUSGovCloud property value. The tenant ID in the Azure Government cloud corresponding to the GCC tenant in the public cloud. Currently, 1:1 mappings are supported, so this collection can only contain one tenant ID.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOrganizationIdsInUSGovCloud() {
        return this.backingStore.get("organizationIdsInUSGovCloud");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("organizationIdsInUSGovCloud", this.getOrganizationIdsInUSGovCloud());
    }
    /**
     * Sets the organizationIdsInUSGovCloud property value. The tenant ID in the Azure Government cloud corresponding to the GCC tenant in the public cloud. Currently, 1:1 mappings are supported, so this collection can only contain one tenant ID.
     * @param value Value to set for the organizationIdsInUSGovCloud property.
     */
    public void setOrganizationIdsInUSGovCloud(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("organizationIdsInUSGovCloud", value);
    }
}
