package com.microsoft.graph.beta.models.industrydata;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdministrativeUnitProvisioningFlow extends ProvisioningFlow implements Parsable {
    /**
     * Instantiates a new {@link AdministrativeUnitProvisioningFlow} and sets the default values.
     */
    public AdministrativeUnitProvisioningFlow() {
        super();
        this.setOdataType("#microsoft.graph.industryData.administrativeUnitProvisioningFlow");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AdministrativeUnitProvisioningFlow}
     */
    @jakarta.annotation.Nonnull
    public static AdministrativeUnitProvisioningFlow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdministrativeUnitProvisioningFlow();
    }
    /**
     * Gets the creationOptions property value. The creationOptions property
     * @return a {@link AdminUnitCreationOptions}
     */
    @jakarta.annotation.Nullable
    public AdminUnitCreationOptions getCreationOptions() {
        return this.backingStore.get("creationOptions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("creationOptions", (n) -> { this.setCreationOptions(n.getObjectValue(AdminUnitCreationOptions::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("creationOptions", this.getCreationOptions());
    }
    /**
     * Sets the creationOptions property value. The creationOptions property
     * @param value Value to set for the creationOptions property.
     */
    public void setCreationOptions(@jakarta.annotation.Nullable final AdminUnitCreationOptions value) {
        this.backingStore.set("creationOptions", value);
    }
}
