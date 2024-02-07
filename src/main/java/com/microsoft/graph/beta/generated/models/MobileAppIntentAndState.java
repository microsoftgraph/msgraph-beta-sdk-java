package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * MobileApp Intent and Install State for a given device.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppIntentAndState extends Entity implements Parsable {
    /**
     * Instantiates a new MobileAppIntentAndState and sets the default values.
     */
    public MobileAppIntentAndState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MobileAppIntentAndState
     */
    @jakarta.annotation.Nonnull
    public static MobileAppIntentAndState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppIntentAndState();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("managedDeviceIdentifier", (n) -> { this.setManagedDeviceIdentifier(n.getStringValue()); });
        deserializerMap.put("mobileAppList", (n) -> { this.setMobileAppList(n.getCollectionOfObjectValues(MobileAppIntentAndStateDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managedDeviceIdentifier property value. Device identifier created or collected by Intune.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceIdentifier() {
        return this.backingStore.get("managedDeviceIdentifier");
    }
    /**
     * Gets the mobileAppList property value. The list of payload intents and states for the tenant.
     * @return a java.util.List<MobileAppIntentAndStateDetail>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileAppIntentAndStateDetail> getMobileAppList() {
        return this.backingStore.get("mobileAppList");
    }
    /**
     * Gets the userId property value. Identifier for the user that tried to enroll the device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("managedDeviceIdentifier", this.getManagedDeviceIdentifier());
        writer.writeCollectionOfObjectValues("mobileAppList", this.getMobileAppList());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the managedDeviceIdentifier property value. Device identifier created or collected by Intune.
     * @param value Value to set for the managedDeviceIdentifier property.
     */
    public void setManagedDeviceIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedDeviceIdentifier", value);
    }
    /**
     * Sets the mobileAppList property value. The list of payload intents and states for the tenant.
     * @param value Value to set for the mobileAppList property.
     */
    public void setMobileAppList(@jakarta.annotation.Nullable final java.util.List<MobileAppIntentAndStateDetail> value) {
        this.backingStore.set("mobileAppList", value);
    }
    /**
     * Sets the userId property value. Identifier for the user that tried to enroll the device.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
}
