package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * BitLocker Encryption Base Policies.
 */
public class BitLockerSystemDrivePolicy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Select the encryption method for operating system drives. Possible values are: aesCbc128, aesCbc256, xtsAes128, xtsAes256.
     */
    private BitLockerEncryptionMethod encryptionMethod;
    /**
     * Indicates the minimum length of startup pin. Valid values 4 to 20
     */
    private Integer minimumPinLength;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Enable pre-boot recovery message and Url. If requireStartupAuthentication is false, this value does not affect.
     */
    private Boolean prebootRecoveryEnableMessageAndUrl;
    /**
     * Defines a custom recovery message.
     */
    private String prebootRecoveryMessage;
    /**
     * Defines a custom recovery URL.
     */
    private String prebootRecoveryUrl;
    /**
     * Allows to recover BitLocker encrypted operating system drives in the absence of the required startup key information. This policy setting is applied when you turn on BitLocker.
     */
    private BitLockerRecoveryOptions recoveryOptions;
    /**
     * Indicates whether to allow BitLocker without a compatible TPM (requires a password or a startup key on a USB flash drive).
     */
    private Boolean startupAuthenticationBlockWithoutTpmChip;
    /**
     * Require additional authentication at startup.
     */
    private Boolean startupAuthenticationRequired;
    /**
     * Possible values of the ConfigurationUsage list.
     */
    private ConfigurationUsage startupAuthenticationTpmKeyUsage;
    /**
     * Possible values of the ConfigurationUsage list.
     */
    private ConfigurationUsage startupAuthenticationTpmPinAndKeyUsage;
    /**
     * Possible values of the ConfigurationUsage list.
     */
    private ConfigurationUsage startupAuthenticationTpmPinUsage;
    /**
     * Possible values of the ConfigurationUsage list.
     */
    private ConfigurationUsage startupAuthenticationTpmUsage;
    /**
     * Instantiates a new bitLockerSystemDrivePolicy and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public BitLockerSystemDrivePolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bitLockerSystemDrivePolicy
     */
    @jakarta.annotation.Nonnull
    public static BitLockerSystemDrivePolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BitLockerSystemDrivePolicy();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the encryptionMethod property value. Select the encryption method for operating system drives. Possible values are: aesCbc128, aesCbc256, xtsAes128, xtsAes256.
     * @return a bitLockerEncryptionMethod
     */
    @jakarta.annotation.Nullable
    public BitLockerEncryptionMethod getEncryptionMethod() {
        return this.encryptionMethod;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("encryptionMethod", (n) -> { this.setEncryptionMethod(n.getEnumValue(BitLockerEncryptionMethod.class)); });
        deserializerMap.put("minimumPinLength", (n) -> { this.setMinimumPinLength(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("prebootRecoveryEnableMessageAndUrl", (n) -> { this.setPrebootRecoveryEnableMessageAndUrl(n.getBooleanValue()); });
        deserializerMap.put("prebootRecoveryMessage", (n) -> { this.setPrebootRecoveryMessage(n.getStringValue()); });
        deserializerMap.put("prebootRecoveryUrl", (n) -> { this.setPrebootRecoveryUrl(n.getStringValue()); });
        deserializerMap.put("recoveryOptions", (n) -> { this.setRecoveryOptions(n.getObjectValue(BitLockerRecoveryOptions::createFromDiscriminatorValue)); });
        deserializerMap.put("startupAuthenticationBlockWithoutTpmChip", (n) -> { this.setStartupAuthenticationBlockWithoutTpmChip(n.getBooleanValue()); });
        deserializerMap.put("startupAuthenticationRequired", (n) -> { this.setStartupAuthenticationRequired(n.getBooleanValue()); });
        deserializerMap.put("startupAuthenticationTpmKeyUsage", (n) -> { this.setStartupAuthenticationTpmKeyUsage(n.getEnumValue(ConfigurationUsage.class)); });
        deserializerMap.put("startupAuthenticationTpmPinAndKeyUsage", (n) -> { this.setStartupAuthenticationTpmPinAndKeyUsage(n.getEnumValue(ConfigurationUsage.class)); });
        deserializerMap.put("startupAuthenticationTpmPinUsage", (n) -> { this.setStartupAuthenticationTpmPinUsage(n.getEnumValue(ConfigurationUsage.class)); });
        deserializerMap.put("startupAuthenticationTpmUsage", (n) -> { this.setStartupAuthenticationTpmUsage(n.getEnumValue(ConfigurationUsage.class)); });
        return deserializerMap;
    }
    /**
     * Gets the minimumPinLength property value. Indicates the minimum length of startup pin. Valid values 4 to 20
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMinimumPinLength() {
        return this.minimumPinLength;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the prebootRecoveryEnableMessageAndUrl property value. Enable pre-boot recovery message and Url. If requireStartupAuthentication is false, this value does not affect.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPrebootRecoveryEnableMessageAndUrl() {
        return this.prebootRecoveryEnableMessageAndUrl;
    }
    /**
     * Gets the prebootRecoveryMessage property value. Defines a custom recovery message.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPrebootRecoveryMessage() {
        return this.prebootRecoveryMessage;
    }
    /**
     * Gets the prebootRecoveryUrl property value. Defines a custom recovery URL.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPrebootRecoveryUrl() {
        return this.prebootRecoveryUrl;
    }
    /**
     * Gets the recoveryOptions property value. Allows to recover BitLocker encrypted operating system drives in the absence of the required startup key information. This policy setting is applied when you turn on BitLocker.
     * @return a bitLockerRecoveryOptions
     */
    @jakarta.annotation.Nullable
    public BitLockerRecoveryOptions getRecoveryOptions() {
        return this.recoveryOptions;
    }
    /**
     * Gets the startupAuthenticationBlockWithoutTpmChip property value. Indicates whether to allow BitLocker without a compatible TPM (requires a password or a startup key on a USB flash drive).
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStartupAuthenticationBlockWithoutTpmChip() {
        return this.startupAuthenticationBlockWithoutTpmChip;
    }
    /**
     * Gets the startupAuthenticationRequired property value. Require additional authentication at startup.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStartupAuthenticationRequired() {
        return this.startupAuthenticationRequired;
    }
    /**
     * Gets the startupAuthenticationTpmKeyUsage property value. Possible values of the ConfigurationUsage list.
     * @return a configurationUsage
     */
    @jakarta.annotation.Nullable
    public ConfigurationUsage getStartupAuthenticationTpmKeyUsage() {
        return this.startupAuthenticationTpmKeyUsage;
    }
    /**
     * Gets the startupAuthenticationTpmPinAndKeyUsage property value. Possible values of the ConfigurationUsage list.
     * @return a configurationUsage
     */
    @jakarta.annotation.Nullable
    public ConfigurationUsage getStartupAuthenticationTpmPinAndKeyUsage() {
        return this.startupAuthenticationTpmPinAndKeyUsage;
    }
    /**
     * Gets the startupAuthenticationTpmPinUsage property value. Possible values of the ConfigurationUsage list.
     * @return a configurationUsage
     */
    @jakarta.annotation.Nullable
    public ConfigurationUsage getStartupAuthenticationTpmPinUsage() {
        return this.startupAuthenticationTpmPinUsage;
    }
    /**
     * Gets the startupAuthenticationTpmUsage property value. Possible values of the ConfigurationUsage list.
     * @return a configurationUsage
     */
    @jakarta.annotation.Nullable
    public ConfigurationUsage getStartupAuthenticationTpmUsage() {
        return this.startupAuthenticationTpmUsage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the encryptionMethod property value. Select the encryption method for operating system drives. Possible values are: aesCbc128, aesCbc256, xtsAes128, xtsAes256.
     * @param value Value to set for the encryptionMethod property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEncryptionMethod(@jakarta.annotation.Nullable final BitLockerEncryptionMethod value) {
        this.encryptionMethod = value;
    }
    /**
     * Sets the minimumPinLength property value. Indicates the minimum length of startup pin. Valid values 4 to 20
     * @param value Value to set for the minimumPinLength property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMinimumPinLength(@jakarta.annotation.Nullable final Integer value) {
        this.minimumPinLength = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the prebootRecoveryEnableMessageAndUrl property value. Enable pre-boot recovery message and Url. If requireStartupAuthentication is false, this value does not affect.
     * @param value Value to set for the prebootRecoveryEnableMessageAndUrl property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPrebootRecoveryEnableMessageAndUrl(@jakarta.annotation.Nullable final Boolean value) {
        this.prebootRecoveryEnableMessageAndUrl = value;
    }
    /**
     * Sets the prebootRecoveryMessage property value. Defines a custom recovery message.
     * @param value Value to set for the prebootRecoveryMessage property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPrebootRecoveryMessage(@jakarta.annotation.Nullable final String value) {
        this.prebootRecoveryMessage = value;
    }
    /**
     * Sets the prebootRecoveryUrl property value. Defines a custom recovery URL.
     * @param value Value to set for the prebootRecoveryUrl property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPrebootRecoveryUrl(@jakarta.annotation.Nullable final String value) {
        this.prebootRecoveryUrl = value;
    }
    /**
     * Sets the recoveryOptions property value. Allows to recover BitLocker encrypted operating system drives in the absence of the required startup key information. This policy setting is applied when you turn on BitLocker.
     * @param value Value to set for the recoveryOptions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRecoveryOptions(@jakarta.annotation.Nullable final BitLockerRecoveryOptions value) {
        this.recoveryOptions = value;
    }
    /**
     * Sets the startupAuthenticationBlockWithoutTpmChip property value. Indicates whether to allow BitLocker without a compatible TPM (requires a password or a startup key on a USB flash drive).
     * @param value Value to set for the startupAuthenticationBlockWithoutTpmChip property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStartupAuthenticationBlockWithoutTpmChip(@jakarta.annotation.Nullable final Boolean value) {
        this.startupAuthenticationBlockWithoutTpmChip = value;
    }
    /**
     * Sets the startupAuthenticationRequired property value. Require additional authentication at startup.
     * @param value Value to set for the startupAuthenticationRequired property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStartupAuthenticationRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.startupAuthenticationRequired = value;
    }
    /**
     * Sets the startupAuthenticationTpmKeyUsage property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the startupAuthenticationTpmKeyUsage property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStartupAuthenticationTpmKeyUsage(@jakarta.annotation.Nullable final ConfigurationUsage value) {
        this.startupAuthenticationTpmKeyUsage = value;
    }
    /**
     * Sets the startupAuthenticationTpmPinAndKeyUsage property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the startupAuthenticationTpmPinAndKeyUsage property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStartupAuthenticationTpmPinAndKeyUsage(@jakarta.annotation.Nullable final ConfigurationUsage value) {
        this.startupAuthenticationTpmPinAndKeyUsage = value;
    }
    /**
     * Sets the startupAuthenticationTpmPinUsage property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the startupAuthenticationTpmPinUsage property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStartupAuthenticationTpmPinUsage(@jakarta.annotation.Nullable final ConfigurationUsage value) {
        this.startupAuthenticationTpmPinUsage = value;
    }
    /**
     * Sets the startupAuthenticationTpmUsage property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the startupAuthenticationTpmUsage property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStartupAuthenticationTpmUsage(@jakarta.annotation.Nullable final ConfigurationUsage value) {
        this.startupAuthenticationTpmUsage = value;
    }
}
