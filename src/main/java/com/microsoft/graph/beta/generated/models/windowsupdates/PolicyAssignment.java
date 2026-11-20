package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PolicyAssignment extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PolicyAssignment} and sets the default values.
     */
    public PolicyAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PolicyAssignment}
     */
    @jakarta.annotation.Nonnull
    public static PolicyAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PolicyAssignment();
    }
    /**
     * Gets the azureAdDeviceId property value. The Microsoft Entra identifier of the assigned device. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAzureAdDeviceId() {
        return this.backingStore.get("azureAdDeviceId");
    }
    /**
     * Gets the deviceProfile property value. The deviceProfile property
     * @return a {@link DeviceProfile}
     */
    @jakarta.annotation.Nullable
    public DeviceProfile getDeviceProfile() {
        return this.backingStore.get("deviceProfile");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureAdDeviceId", (n) -> { this.setAzureAdDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceProfile", (n) -> { this.setDeviceProfile(n.getObjectValue(DeviceProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("policyId", (n) -> { this.setPolicyId(n.getStringValue()); });
        deserializerMap.put("policyName", (n) -> { this.setPolicyName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the policyId property value. The identifier of the assigned Windows Autopatch policy. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyId() {
        return this.backingStore.get("policyId");
    }
    /**
     * Gets the policyName property value. The display name of the assigned Windows Autopatch policy. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyName() {
        return this.backingStore.get("policyName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("deviceProfile", this.getDeviceProfile());
    }
    /**
     * Sets the azureAdDeviceId property value. The Microsoft Entra identifier of the assigned device. Read-only.
     * @param value Value to set for the azureAdDeviceId property.
     */
    public void setAzureAdDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureAdDeviceId", value);
    }
    /**
     * Sets the deviceProfile property value. The deviceProfile property
     * @param value Value to set for the deviceProfile property.
     */
    public void setDeviceProfile(@jakarta.annotation.Nullable final DeviceProfile value) {
        this.backingStore.set("deviceProfile", value);
    }
    /**
     * Sets the policyId property value. The identifier of the assigned Windows Autopatch policy. Read-only.
     * @param value Value to set for the policyId property.
     */
    public void setPolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyId", value);
    }
    /**
     * Sets the policyName property value. The display name of the assigned Windows Autopatch policy. Read-only.
     * @param value Value to set for the policyName property.
     */
    public void setPolicyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyName", value);
    }
}
