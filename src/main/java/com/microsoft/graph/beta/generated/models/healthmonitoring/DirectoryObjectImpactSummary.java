package com.microsoft.graph.beta.models.healthmonitoring;

import com.microsoft.graph.beta.models.DirectoryObject;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DirectoryObjectImpactSummary extends ResourceImpactSummary implements Parsable {
    /**
     * Instantiates a new {@link DirectoryObjectImpactSummary} and sets the default values.
     */
    public DirectoryObjectImpactSummary() {
        super();
        this.setOdataType("#microsoft.graph.healthMonitoring.directoryObjectImpactSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DirectoryObjectImpactSummary}
     */
    @jakarta.annotation.Nonnull
    public static DirectoryObjectImpactSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.healthMonitoring.applicationImpactSummary": return new ApplicationImpactSummary();
                case "#microsoft.graph.healthMonitoring.deviceImpactSummary": return new DeviceImpactSummary();
                case "#microsoft.graph.healthMonitoring.groupImpactSummary": return new GroupImpactSummary();
                case "#microsoft.graph.healthMonitoring.servicePrincipalImpactSummary": return new ServicePrincipalImpactSummary();
                case "#microsoft.graph.healthMonitoring.userImpactSummary": return new UserImpactSummary();
            }
        }
        return new DirectoryObjectImpactSummary();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("resourceSampling", (n) -> { this.setResourceSampling(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resourceSampling property value. The resourceSampling property
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getResourceSampling() {
        return this.backingStore.get("resourceSampling");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("resourceSampling", this.getResourceSampling());
    }
    /**
     * Sets the resourceSampling property value. The resourceSampling property
     * @param value Value to set for the resourceSampling property.
     */
    public void setResourceSampling(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("resourceSampling", value);
    }
}
