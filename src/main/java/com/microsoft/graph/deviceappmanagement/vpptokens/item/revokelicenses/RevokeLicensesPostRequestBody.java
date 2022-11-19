package com.microsoft.graph.deviceappmanagement.vpptokens.item.revokelicenses;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the revokeLicenses method. */
public class RevokeLicensesPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The notifyManagedDevices property */
    private Boolean _notifyManagedDevices;
    /** The revokeUntrackedLicenses property */
    private Boolean _revokeUntrackedLicenses;
    /**
     * Instantiates a new revokeLicensesPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RevokeLicensesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a revokeLicensesPostRequestBody
     */
    @javax.annotation.Nonnull
    public static RevokeLicensesPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RevokeLicensesPostRequestBody();
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
        final RevokeLicensesPostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(2);
        deserializerMap.put("notifyManagedDevices", (n) -> { currentObject.setNotifyManagedDevices(n.getBooleanValue()); });
        deserializerMap.put("revokeUntrackedLicenses", (n) -> { currentObject.setRevokeUntrackedLicenses(n.getBooleanValue()); });
        return deserializerMap
    }
    /**
     * Gets the notifyManagedDevices property value. The notifyManagedDevices property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNotifyManagedDevices() {
        return this._notifyManagedDevices;
    }
    /**
     * Gets the revokeUntrackedLicenses property value. The revokeUntrackedLicenses property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRevokeUntrackedLicenses() {
        return this._revokeUntrackedLicenses;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("notifyManagedDevices", this.getNotifyManagedDevices());
        writer.writeBooleanValue("revokeUntrackedLicenses", this.getRevokeUntrackedLicenses());
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
     * Sets the notifyManagedDevices property value. The notifyManagedDevices property
     * @param value Value to set for the notifyManagedDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotifyManagedDevices(@javax.annotation.Nullable final Boolean value) {
        this._notifyManagedDevices = value;
    }
    /**
     * Sets the revokeUntrackedLicenses property value. The revokeUntrackedLicenses property
     * @param value Value to set for the revokeUntrackedLicenses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRevokeUntrackedLicenses(@javax.annotation.Nullable final Boolean value) {
        this._revokeUntrackedLicenses = value;
    }
}
