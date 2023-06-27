package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceLocalCredential extends Entity implements Parsable {
    /**
     * The name of the local admin account for which LAPS is enabled.
     */
    private String accountName;
    /**
     * The SID of the local admin account for which LAPS is enabled.
     */
    private String accountSid;
    /**
     * When the local adminstrator account credential for the device object was backed up to Azure Active Directory.
     */
    private OffsetDateTime backupDateTime;
    /**
     * The password for the local administrator account that is backed up to Azure Active Directory and returned as a base 64 encoded value.
     */
    private String passwordBase64;
    /**
     * Instantiates a new deviceLocalCredential and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceLocalCredential() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceLocalCredential
     */
    @javax.annotation.Nonnull
    public static DeviceLocalCredential createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceLocalCredential();
    }
    /**
     * Gets the accountName property value. The name of the local admin account for which LAPS is enabled.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountName() {
        return this.accountName;
    }
    /**
     * Gets the accountSid property value. The SID of the local admin account for which LAPS is enabled.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountSid() {
        return this.accountSid;
    }
    /**
     * Gets the backupDateTime property value. When the local adminstrator account credential for the device object was backed up to Azure Active Directory.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getBackupDateTime() {
        return this.backupDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountName", (n) -> { this.setAccountName(n.getStringValue()); });
        deserializerMap.put("accountSid", (n) -> { this.setAccountSid(n.getStringValue()); });
        deserializerMap.put("backupDateTime", (n) -> { this.setBackupDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("passwordBase64", (n) -> { this.setPasswordBase64(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the passwordBase64 property value. The password for the local administrator account that is backed up to Azure Active Directory and returned as a base 64 encoded value.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPasswordBase64() {
        return this.passwordBase64;
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
        writer.writeStringValue("accountName", this.getAccountName());
        writer.writeStringValue("accountSid", this.getAccountSid());
        writer.writeOffsetDateTimeValue("backupDateTime", this.getBackupDateTime());
        writer.writeStringValue("passwordBase64", this.getPasswordBase64());
    }
    /**
     * Sets the accountName property value. The name of the local admin account for which LAPS is enabled.
     * @param value Value to set for the accountName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountName(@javax.annotation.Nullable final String value) {
        this.accountName = value;
    }
    /**
     * Sets the accountSid property value. The SID of the local admin account for which LAPS is enabled.
     * @param value Value to set for the accountSid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountSid(@javax.annotation.Nullable final String value) {
        this.accountSid = value;
    }
    /**
     * Sets the backupDateTime property value. When the local adminstrator account credential for the device object was backed up to Azure Active Directory.
     * @param value Value to set for the backupDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBackupDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.backupDateTime = value;
    }
    /**
     * Sets the passwordBase64 property value. The password for the local administrator account that is backed up to Azure Active Directory and returned as a base 64 encoded value.
     * @param value Value to set for the passwordBase64 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordBase64(@javax.annotation.Nullable final String value) {
        this.passwordBase64 = value;
    }
}
