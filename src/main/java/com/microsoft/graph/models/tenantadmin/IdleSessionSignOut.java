package com.microsoft.graph.models.tenantadmin;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IdleSessionSignOut implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates whether the idle session sign-out policy is enabled. */
    private Boolean _isEnabled;
    /** The OdataType property */
    private String _odataType;
    /** Number of seconds of inactivity after which a user is signed out. */
    private Long _signOutAfterInSeconds;
    /** Number of seconds of inactivity after which a user is notified that they'll be signed out. */
    private Long _warnAfterInSeconds;
    /**
     * Instantiates a new idleSessionSignOut and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IdleSessionSignOut() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a idleSessionSignOut
     */
    @javax.annotation.Nonnull
    public static IdleSessionSignOut createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdleSessionSignOut();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("signOutAfterInSeconds", (n) -> { this.setSignOutAfterInSeconds(n.getLongValue()); });
        deserializerMap.put("warnAfterInSeconds", (n) -> { this.setWarnAfterInSeconds(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. Indicates whether the idle session sign-out policy is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this._isEnabled;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the signOutAfterInSeconds property value. Number of seconds of inactivity after which a user is signed out.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSignOutAfterInSeconds() {
        return this._signOutAfterInSeconds;
    }
    /**
     * Gets the warnAfterInSeconds property value. Number of seconds of inactivity after which a user is notified that they'll be signed out.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getWarnAfterInSeconds() {
        return this._warnAfterInSeconds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("signOutAfterInSeconds", this.getSignOutAfterInSeconds());
        writer.writeLongValue("warnAfterInSeconds", this.getWarnAfterInSeconds());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the isEnabled property value. Indicates whether the idle session sign-out policy is enabled.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the signOutAfterInSeconds property value. Number of seconds of inactivity after which a user is signed out.
     * @param value Value to set for the signOutAfterInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSignOutAfterInSeconds(@javax.annotation.Nullable final Long value) {
        this._signOutAfterInSeconds = value;
    }
    /**
     * Sets the warnAfterInSeconds property value. Number of seconds of inactivity after which a user is notified that they'll be signed out.
     * @param value Value to set for the warnAfterInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWarnAfterInSeconds(@javax.annotation.Nullable final Long value) {
        this._warnAfterInSeconds = value;
    }
}
