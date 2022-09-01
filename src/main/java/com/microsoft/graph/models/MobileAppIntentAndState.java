package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MobileAppIntentAndState extends Entity implements Parsable {
    /** Device identifier created or collected by Intune. */
    private String _managedDeviceIdentifier;
    /** The list of payload intents and states for the tenant. */
    private java.util.List<MobileAppIntentAndStateDetail> _mobileAppList;
    /** Identifier for the user that tried to enroll the device. */
    private String _userId;
    /**
     * Instantiates a new MobileAppIntentAndState and sets the default values.
     * @return a void
     */
    public MobileAppIntentAndState() {
        super();
        this.setOdataType("#microsoft.graph.mobileAppIntentAndState");
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
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MobileAppIntentAndState currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("managedDeviceIdentifier", (n) -> { currentObject.setManagedDeviceIdentifier(n.getStringValue()); });
            this.put("mobileAppList", (n) -> { currentObject.setMobileAppList(n.getCollectionOfObjectValues(MobileAppIntentAndStateDetail::createFromDiscriminatorValue)); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the managedDeviceIdentifier property value. Device identifier created or collected by Intune.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceIdentifier() {
        return this._managedDeviceIdentifier;
    }
    /**
     * Gets the mobileAppList property value. The list of payload intents and states for the tenant.
     * @return a mobileAppIntentAndStateDetail
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppIntentAndStateDetail> getMobileAppList() {
        return this._mobileAppList;
    }
    /**
     * Gets the userId property value. Identifier for the user that tried to enroll the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setManagedDeviceIdentifier(@javax.annotation.Nullable final String value) {
        this._managedDeviceIdentifier = value;
    }
    /**
     * Sets the mobileAppList property value. The list of payload intents and states for the tenant.
     * @param value Value to set for the mobileAppList property.
     * @return a void
     */
    public void setMobileAppList(@javax.annotation.Nullable final java.util.List<MobileAppIntentAndStateDetail> value) {
        this._mobileAppList = value;
    }
    /**
     * Sets the userId property value. Identifier for the user that tried to enroll the device.
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
}
