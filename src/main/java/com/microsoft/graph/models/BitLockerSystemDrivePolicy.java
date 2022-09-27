package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** BitLocker Encryption Base Policies. */
public class BitLockerSystemDrivePolicy implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Select the encryption method for operating system drives. Possible values are: aesCbc128, aesCbc256, xtsAes128, xtsAes256. */
    private BitLockerEncryptionMethod _encryptionMethod;
    /** Indicates the minimum length of startup pin. Valid values 4 to 20 */
    private Integer _minimumPinLength;
    /** The OdataType property */
    private String _odataType;
    /** Enable pre-boot recovery message and Url. If requireStartupAuthentication is false, this value does not affect. */
    private Boolean _prebootRecoveryEnableMessageAndUrl;
    /** Defines a custom recovery message. */
    private String _prebootRecoveryMessage;
    /** Defines a custom recovery URL. */
    private String _prebootRecoveryUrl;
    /** Allows to recover BitLocker encrypted operating system drives in the absence of the required startup key information. This policy setting is applied when you turn on BitLocker. */
    private BitLockerRecoveryOptions _recoveryOptions;
    /** Indicates whether to allow BitLocker without a compatible TPM (requires a password or a startup key on a USB flash drive). */
    private Boolean _startupAuthenticationBlockWithoutTpmChip;
    /** Require additional authentication at startup. */
    private Boolean _startupAuthenticationRequired;
    /** Possible values of the ConfigurationUsage list. */
    private ConfigurationUsage _startupAuthenticationTpmKeyUsage;
    /** Possible values of the ConfigurationUsage list. */
    private ConfigurationUsage _startupAuthenticationTpmPinAndKeyUsage;
    /** Possible values of the ConfigurationUsage list. */
    private ConfigurationUsage _startupAuthenticationTpmPinUsage;
    /** Possible values of the ConfigurationUsage list. */
    private ConfigurationUsage _startupAuthenticationTpmUsage;
    /**
     * Instantiates a new bitLockerSystemDrivePolicy and sets the default values.
     * @return a void
     */
    public BitLockerSystemDrivePolicy() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.bitLockerSystemDrivePolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bitLockerSystemDrivePolicy
     */
    @javax.annotation.Nonnull
    public static BitLockerSystemDrivePolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BitLockerSystemDrivePolicy();
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
     * Gets the encryptionMethod property value. Select the encryption method for operating system drives. Possible values are: aesCbc128, aesCbc256, xtsAes128, xtsAes256.
     * @return a bitLockerEncryptionMethod
     */
    @javax.annotation.Nullable
    public BitLockerEncryptionMethod getEncryptionMethod() {
        return this._encryptionMethod;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BitLockerSystemDrivePolicy currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(13) {{
            this.put("encryptionMethod", (n) -> { currentObject.setEncryptionMethod(n.getEnumValue(BitLockerEncryptionMethod.class)); });
            this.put("minimumPinLength", (n) -> { currentObject.setMinimumPinLength(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("prebootRecoveryEnableMessageAndUrl", (n) -> { currentObject.setPrebootRecoveryEnableMessageAndUrl(n.getBooleanValue()); });
            this.put("prebootRecoveryMessage", (n) -> { currentObject.setPrebootRecoveryMessage(n.getStringValue()); });
            this.put("prebootRecoveryUrl", (n) -> { currentObject.setPrebootRecoveryUrl(n.getStringValue()); });
            this.put("recoveryOptions", (n) -> { currentObject.setRecoveryOptions(n.getObjectValue(BitLockerRecoveryOptions::createFromDiscriminatorValue)); });
            this.put("startupAuthenticationBlockWithoutTpmChip", (n) -> { currentObject.setStartupAuthenticationBlockWithoutTpmChip(n.getBooleanValue()); });
            this.put("startupAuthenticationRequired", (n) -> { currentObject.setStartupAuthenticationRequired(n.getBooleanValue()); });
            this.put("startupAuthenticationTpmKeyUsage", (n) -> { currentObject.setStartupAuthenticationTpmKeyUsage(n.getEnumValue(ConfigurationUsage.class)); });
            this.put("startupAuthenticationTpmPinAndKeyUsage", (n) -> { currentObject.setStartupAuthenticationTpmPinAndKeyUsage(n.getEnumValue(ConfigurationUsage.class)); });
            this.put("startupAuthenticationTpmPinUsage", (n) -> { currentObject.setStartupAuthenticationTpmPinUsage(n.getEnumValue(ConfigurationUsage.class)); });
            this.put("startupAuthenticationTpmUsage", (n) -> { currentObject.setStartupAuthenticationTpmUsage(n.getEnumValue(ConfigurationUsage.class)); });
        }};
    }
    /**
     * Gets the minimumPinLength property value. Indicates the minimum length of startup pin. Valid values 4 to 20
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinimumPinLength() {
        return this._minimumPinLength;
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
     * Gets the prebootRecoveryEnableMessageAndUrl property value. Enable pre-boot recovery message and Url. If requireStartupAuthentication is false, this value does not affect.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrebootRecoveryEnableMessageAndUrl() {
        return this._prebootRecoveryEnableMessageAndUrl;
    }
    /**
     * Gets the prebootRecoveryMessage property value. Defines a custom recovery message.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrebootRecoveryMessage() {
        return this._prebootRecoveryMessage;
    }
    /**
     * Gets the prebootRecoveryUrl property value. Defines a custom recovery URL.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrebootRecoveryUrl() {
        return this._prebootRecoveryUrl;
    }
    /**
     * Gets the recoveryOptions property value. Allows to recover BitLocker encrypted operating system drives in the absence of the required startup key information. This policy setting is applied when you turn on BitLocker.
     * @return a bitLockerRecoveryOptions
     */
    @javax.annotation.Nullable
    public BitLockerRecoveryOptions getRecoveryOptions() {
        return this._recoveryOptions;
    }
    /**
     * Gets the startupAuthenticationBlockWithoutTpmChip property value. Indicates whether to allow BitLocker without a compatible TPM (requires a password or a startup key on a USB flash drive).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartupAuthenticationBlockWithoutTpmChip() {
        return this._startupAuthenticationBlockWithoutTpmChip;
    }
    /**
     * Gets the startupAuthenticationRequired property value. Require additional authentication at startup.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartupAuthenticationRequired() {
        return this._startupAuthenticationRequired;
    }
    /**
     * Gets the startupAuthenticationTpmKeyUsage property value. Possible values of the ConfigurationUsage list.
     * @return a configurationUsage
     */
    @javax.annotation.Nullable
    public ConfigurationUsage getStartupAuthenticationTpmKeyUsage() {
        return this._startupAuthenticationTpmKeyUsage;
    }
    /**
     * Gets the startupAuthenticationTpmPinAndKeyUsage property value. Possible values of the ConfigurationUsage list.
     * @return a configurationUsage
     */
    @javax.annotation.Nullable
    public ConfigurationUsage getStartupAuthenticationTpmPinAndKeyUsage() {
        return this._startupAuthenticationTpmPinAndKeyUsage;
    }
    /**
     * Gets the startupAuthenticationTpmPinUsage property value. Possible values of the ConfigurationUsage list.
     * @return a configurationUsage
     */
    @javax.annotation.Nullable
    public ConfigurationUsage getStartupAuthenticationTpmPinUsage() {
        return this._startupAuthenticationTpmPinUsage;
    }
    /**
     * Gets the startupAuthenticationTpmUsage property value. Possible values of the ConfigurationUsage list.
     * @return a configurationUsage
     */
    @javax.annotation.Nullable
    public ConfigurationUsage getStartupAuthenticationTpmUsage() {
        return this._startupAuthenticationTpmUsage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("encryptionMethod", this.getEncryptionMethod());
        writer.writeIntegerValue("minimumPinLength", this.getMinimumPinLength());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("prebootRecoveryEnableMessageAndUrl", this.getPrebootRecoveryEnableMessageAndUrl());
        writer.writeStringValue("prebootRecoveryMessage", this.getPrebootRecoveryMessage());
        writer.writeStringValue("prebootRecoveryUrl", this.getPrebootRecoveryUrl());
        writer.writeObjectValue("recoveryOptions", this.getRecoveryOptions());
        writer.writeBooleanValue("startupAuthenticationBlockWithoutTpmChip", this.getStartupAuthenticationBlockWithoutTpmChip());
        writer.writeBooleanValue("startupAuthenticationRequired", this.getStartupAuthenticationRequired());
        writer.writeEnumValue("startupAuthenticationTpmKeyUsage", this.getStartupAuthenticationTpmKeyUsage());
        writer.writeEnumValue("startupAuthenticationTpmPinAndKeyUsage", this.getStartupAuthenticationTpmPinAndKeyUsage());
        writer.writeEnumValue("startupAuthenticationTpmPinUsage", this.getStartupAuthenticationTpmPinUsage());
        writer.writeEnumValue("startupAuthenticationTpmUsage", this.getStartupAuthenticationTpmUsage());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the encryptionMethod property value. Select the encryption method for operating system drives. Possible values are: aesCbc128, aesCbc256, xtsAes128, xtsAes256.
     * @param value Value to set for the encryptionMethod property.
     * @return a void
     */
    public void setEncryptionMethod(@javax.annotation.Nullable final BitLockerEncryptionMethod value) {
        this._encryptionMethod = value;
    }
    /**
     * Sets the minimumPinLength property value. Indicates the minimum length of startup pin. Valid values 4 to 20
     * @param value Value to set for the minimumPinLength property.
     * @return a void
     */
    public void setMinimumPinLength(@javax.annotation.Nullable final Integer value) {
        this._minimumPinLength = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the prebootRecoveryEnableMessageAndUrl property value. Enable pre-boot recovery message and Url. If requireStartupAuthentication is false, this value does not affect.
     * @param value Value to set for the prebootRecoveryEnableMessageAndUrl property.
     * @return a void
     */
    public void setPrebootRecoveryEnableMessageAndUrl(@javax.annotation.Nullable final Boolean value) {
        this._prebootRecoveryEnableMessageAndUrl = value;
    }
    /**
     * Sets the prebootRecoveryMessage property value. Defines a custom recovery message.
     * @param value Value to set for the prebootRecoveryMessage property.
     * @return a void
     */
    public void setPrebootRecoveryMessage(@javax.annotation.Nullable final String value) {
        this._prebootRecoveryMessage = value;
    }
    /**
     * Sets the prebootRecoveryUrl property value. Defines a custom recovery URL.
     * @param value Value to set for the prebootRecoveryUrl property.
     * @return a void
     */
    public void setPrebootRecoveryUrl(@javax.annotation.Nullable final String value) {
        this._prebootRecoveryUrl = value;
    }
    /**
     * Sets the recoveryOptions property value. Allows to recover BitLocker encrypted operating system drives in the absence of the required startup key information. This policy setting is applied when you turn on BitLocker.
     * @param value Value to set for the recoveryOptions property.
     * @return a void
     */
    public void setRecoveryOptions(@javax.annotation.Nullable final BitLockerRecoveryOptions value) {
        this._recoveryOptions = value;
    }
    /**
     * Sets the startupAuthenticationBlockWithoutTpmChip property value. Indicates whether to allow BitLocker without a compatible TPM (requires a password or a startup key on a USB flash drive).
     * @param value Value to set for the startupAuthenticationBlockWithoutTpmChip property.
     * @return a void
     */
    public void setStartupAuthenticationBlockWithoutTpmChip(@javax.annotation.Nullable final Boolean value) {
        this._startupAuthenticationBlockWithoutTpmChip = value;
    }
    /**
     * Sets the startupAuthenticationRequired property value. Require additional authentication at startup.
     * @param value Value to set for the startupAuthenticationRequired property.
     * @return a void
     */
    public void setStartupAuthenticationRequired(@javax.annotation.Nullable final Boolean value) {
        this._startupAuthenticationRequired = value;
    }
    /**
     * Sets the startupAuthenticationTpmKeyUsage property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the startupAuthenticationTpmKeyUsage property.
     * @return a void
     */
    public void setStartupAuthenticationTpmKeyUsage(@javax.annotation.Nullable final ConfigurationUsage value) {
        this._startupAuthenticationTpmKeyUsage = value;
    }
    /**
     * Sets the startupAuthenticationTpmPinAndKeyUsage property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the startupAuthenticationTpmPinAndKeyUsage property.
     * @return a void
     */
    public void setStartupAuthenticationTpmPinAndKeyUsage(@javax.annotation.Nullable final ConfigurationUsage value) {
        this._startupAuthenticationTpmPinAndKeyUsage = value;
    }
    /**
     * Sets the startupAuthenticationTpmPinUsage property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the startupAuthenticationTpmPinUsage property.
     * @return a void
     */
    public void setStartupAuthenticationTpmPinUsage(@javax.annotation.Nullable final ConfigurationUsage value) {
        this._startupAuthenticationTpmPinUsage = value;
    }
    /**
     * Sets the startupAuthenticationTpmUsage property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the startupAuthenticationTpmUsage property.
     * @return a void
     */
    public void setStartupAuthenticationTpmUsage(@javax.annotation.Nullable final ConfigurationUsage value) {
        this._startupAuthenticationTpmUsage = value;
    }
}
