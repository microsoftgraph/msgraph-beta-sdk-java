package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AwsIdentityAccessManagementKeyUsageFinding extends Finding implements Parsable {
    /**
     * The accessKey property
     */
    private AwsAccessKey accessKey;
    /**
     * The actionSummary property
     */
    private ActionSummary actionSummary;
    /**
     * The awsAccessKeyDetails property
     */
    private AwsAccessKeyDetails awsAccessKeyDetails;
    /**
     * The permissionsCreepIndex property
     */
    private PermissionsCreepIndex permissionsCreepIndex;
    /**
     * The status property
     */
    private IamStatus status;
    /**
     * Instantiates a new AwsIdentityAccessManagementKeyUsageFinding and sets the default values.
     */
    public AwsIdentityAccessManagementKeyUsageFinding() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AwsIdentityAccessManagementKeyUsageFinding
     */
    @jakarta.annotation.Nonnull
    public static AwsIdentityAccessManagementKeyUsageFinding createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AwsIdentityAccessManagementKeyUsageFinding();
    }
    /**
     * Gets the accessKey property value. The accessKey property
     * @return a AwsAccessKey
     */
    @jakarta.annotation.Nullable
    public AwsAccessKey getAccessKey() {
        return this.accessKey;
    }
    /**
     * Gets the actionSummary property value. The actionSummary property
     * @return a ActionSummary
     */
    @jakarta.annotation.Nullable
    public ActionSummary getActionSummary() {
        return this.actionSummary;
    }
    /**
     * Gets the awsAccessKeyDetails property value. The awsAccessKeyDetails property
     * @return a AwsAccessKeyDetails
     */
    @jakarta.annotation.Nullable
    public AwsAccessKeyDetails getAwsAccessKeyDetails() {
        return this.awsAccessKeyDetails;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessKey", (n) -> { this.setAccessKey(n.getObjectValue(AwsAccessKey::createFromDiscriminatorValue)); });
        deserializerMap.put("actionSummary", (n) -> { this.setActionSummary(n.getObjectValue(ActionSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("awsAccessKeyDetails", (n) -> { this.setAwsAccessKeyDetails(n.getObjectValue(AwsAccessKeyDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("permissionsCreepIndex", (n) -> { this.setPermissionsCreepIndex(n.getObjectValue(PermissionsCreepIndex::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(IamStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the permissionsCreepIndex property value. The permissionsCreepIndex property
     * @return a PermissionsCreepIndex
     */
    @jakarta.annotation.Nullable
    public PermissionsCreepIndex getPermissionsCreepIndex() {
        return this.permissionsCreepIndex;
    }
    /**
     * Gets the status property value. The status property
     * @return a IamStatus
     */
    @jakarta.annotation.Nullable
    public IamStatus getStatus() {
        return this.status;
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
        this.accessKey = value;
    }
    /**
     * Sets the actionSummary property value. The actionSummary property
     * @param value Value to set for the actionSummary property.
     */
    public void setActionSummary(@jakarta.annotation.Nullable final ActionSummary value) {
        this.actionSummary = value;
    }
    /**
     * Sets the awsAccessKeyDetails property value. The awsAccessKeyDetails property
     * @param value Value to set for the awsAccessKeyDetails property.
     */
    public void setAwsAccessKeyDetails(@jakarta.annotation.Nullable final AwsAccessKeyDetails value) {
        this.awsAccessKeyDetails = value;
    }
    /**
     * Sets the permissionsCreepIndex property value. The permissionsCreepIndex property
     * @param value Value to set for the permissionsCreepIndex property.
     */
    public void setPermissionsCreepIndex(@jakarta.annotation.Nullable final PermissionsCreepIndex value) {
        this.permissionsCreepIndex = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final IamStatus value) {
        this.status = value;
    }
}
