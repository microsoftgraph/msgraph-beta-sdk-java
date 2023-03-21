package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MobileAppIntentAndState extends Entity implements Parsable {
    /** Device identifier created or collected by Intune. */
    private String managedDeviceIdentifier;
    /** The list of payload intents and states for the tenant. */
    private java.util.List<MobileAppIntentAndStateDetail> mobileAppList;
    /** Identifier for the user that tried to enroll the device. */
    private String userId;
    /**
     * Instantiates a new MobileAppIntentAndState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MobileAppIntentAndState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MobileAppIntentAndState
     */
    @javax.annotation.Nonnull
    public static MobileAppIntentAndState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppIntentAndState();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("managedDeviceIdentifier", (n) -> { this.setManagedDeviceIdentifier(n.getStringValue()); });
        deserializerMap.put("mobileAppList", (n) -> { this.setMobileAppList(n.getCollectionOfObjectValues(MobileAppIntentAndStateDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managedDeviceIdentifier property value. Device identifier created or collected by Intune.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceIdentifier() {
        return this.managedDeviceIdentifier;
    }
    /**
     * Gets the mobileAppList property value. The list of payload intents and states for the tenant.
     * @return a mobileAppIntentAndStateDetail
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppIntentAndStateDetail> getMobileAppList() {
        return this.mobileAppList;
    }
    /**
     * Gets the userId property value. Identifier for the user that tried to enroll the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
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
        writer.writeStringValue("managedDeviceIdentifier", this.getManagedDeviceIdentifier());
        writer.writeCollectionOfObjectValues("mobileAppList", this.getMobileAppList());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the managedDeviceIdentifier property value. Device identifier created or collected by Intune.
     * @param value Value to set for the managedDeviceIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceIdentifier(@javax.annotation.Nullable final String value) {
        this.managedDeviceIdentifier = value;
    }
    /**
     * Sets the mobileAppList property value. The list of payload intents and states for the tenant.
     * @param value Value to set for the mobileAppList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobileAppList(@javax.annotation.Nullable final java.util.List<MobileAppIntentAndStateDetail> value) {
        this.mobileAppList = value;
    }
    /**
     * Sets the userId property value. Identifier for the user that tried to enroll the device.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
}
