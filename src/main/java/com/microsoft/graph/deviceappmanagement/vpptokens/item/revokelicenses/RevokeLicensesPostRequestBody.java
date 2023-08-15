package com.microsoft.graph.deviceappmanagement.vpptokens.item.revokelicenses;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RevokeLicensesPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The notifyManagedDevices property
     */
    private Boolean notifyManagedDevices;
    /**
     * The revokeUntrackedLicenses property
     */
    private Boolean revokeUntrackedLicenses;
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
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("notifyManagedDevices", (n) -> { this.setNotifyManagedDevices(n.getBooleanValue()); });
        deserializerMap.put("revokeUntrackedLicenses", (n) -> { this.setRevokeUntrackedLicenses(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the notifyManagedDevices property value. The notifyManagedDevices property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNotifyManagedDevices() {
        return this.notifyManagedDevices;
    }
    /**
     * Gets the revokeUntrackedLicenses property value. The revokeUntrackedLicenses property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRevokeUntrackedLicenses() {
        return this.revokeUntrackedLicenses;
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
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the notifyManagedDevices property value. The notifyManagedDevices property
     * @param value Value to set for the notifyManagedDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotifyManagedDevices(@javax.annotation.Nullable final Boolean value) {
        this.notifyManagedDevices = value;
    }
    /**
     * Sets the revokeUntrackedLicenses property value. The revokeUntrackedLicenses property
     * @param value Value to set for the revokeUntrackedLicenses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRevokeUntrackedLicenses(@javax.annotation.Nullable final Boolean value) {
        this.revokeUntrackedLicenses = value;
    }
}
