package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AwsIdentityAccessManagementKeyUsageFinding extends Finding implements Parsable {
    /**
     * Instantiates a new {@link AwsIdentityAccessManagementKeyUsageFinding} and sets the default values.
     */
    public AwsIdentityAccessManagementKeyUsageFinding() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AwsIdentityAccessManagementKeyUsageFinding}
     */
    @jakarta.annotation.Nonnull
    public static AwsIdentityAccessManagementKeyUsageFinding createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AwsIdentityAccessManagementKeyUsageFinding();
    }
    /**
     * Gets the accessKey property value. The accessKey property
     * @return a {@link AwsAccessKey}
     */
    @jakarta.annotation.Nullable
    public AwsAccessKey getAccessKey() {
        return this.backingStore.get("accessKey");
    }
    /**
     * Gets the actionSummary property value. The actionSummary property
     * @return a {@link ActionSummary}
     */
    @jakarta.annotation.Nullable
    public ActionSummary getActionSummary() {
        return this.backingStore.get("actionSummary");
    }
    /**
     * Gets the awsAccessKeyDetails property value. The awsAccessKeyDetails property
     * @return a {@link AwsAccessKeyDetails}
     */
    @jakarta.annotation.Nullable
    public AwsAccessKeyDetails getAwsAccessKeyDetails() {
        return this.backingStore.get("awsAccessKeyDetails");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessKey", (n) -> { this.setAccessKey(n.getObjectValue(AwsAccessKey::createFromDiscriminatorValue)); });
        deserializerMap.put("actionSummary", (n) -> { this.setActionSummary(n.getObjectValue(ActionSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("awsAccessKeyDetails", (n) -> { this.setAwsAccessKeyDetails(n.getObjectValue(AwsAccessKeyDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("permissionsCreepIndex", (n) -> { this.setPermissionsCreepIndex(n.getObjectValue(PermissionsCreepIndex::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(IamStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the permissionsCreepIndex property value. The permissionsCreepIndex property
     * @return a {@link PermissionsCreepIndex}
     */
    @jakarta.annotation.Nullable
    public PermissionsCreepIndex getPermissionsCreepIndex() {
        return this.backingStore.get("permissionsCreepIndex");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link IamStatus}
     */
    @jakarta.annotation.Nullable
    public IamStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("accessKey", this.getAccessKey());
        writer.writeObjectValue("actionSummary", this.getActionSummary());
        writer.writeObjectValue("awsAccessKeyDetails", this.getAwsAccessKeyDetails());
        writer.writeObjectValue("permissionsCreepIndex", this.getPermissionsCreepIndex());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the accessKey property value. The accessKey property
     * @param value Value to set for the accessKey property.
     */
    public void setAccessKey(@jakarta.annotation.Nullable final AwsAccessKey value) {
        this.backingStore.set("accessKey", value);
    }
    /**
     * Sets the actionSummary property value. The actionSummary property
     * @param value Value to set for the actionSummary property.
     */
    public void setActionSummary(@jakarta.annotation.Nullable final ActionSummary value) {
        this.backingStore.set("actionSummary", value);
    }
    /**
     * Sets the awsAccessKeyDetails property value. The awsAccessKeyDetails property
     * @param value Value to set for the awsAccessKeyDetails property.
     */
    public void setAwsAccessKeyDetails(@jakarta.annotation.Nullable final AwsAccessKeyDetails value) {
        this.backingStore.set("awsAccessKeyDetails", value);
    }
    /**
     * Sets the permissionsCreepIndex property value. The permissionsCreepIndex property
     * @param value Value to set for the permissionsCreepIndex property.
     */
    public void setPermissionsCreepIndex(@jakarta.annotation.Nullable final PermissionsCreepIndex value) {
        this.backingStore.set("permissionsCreepIndex", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final IamStatus value) {
        this.backingStore.set("status", value);
    }
}
