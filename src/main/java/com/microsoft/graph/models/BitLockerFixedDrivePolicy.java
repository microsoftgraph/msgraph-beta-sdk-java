package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * BitLocker Fixed Drive Policies.
 */
public class BitLockerFixedDrivePolicy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Select the encryption method for fixed drives. Possible values are: aesCbc128, aesCbc256, xtsAes128, xtsAes256.
     */
    private BitLockerEncryptionMethod encryptionMethod;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * This policy setting allows you to control how BitLocker-protected fixed data drives are recovered in the absence of the required credentials. This policy setting is applied when you turn on BitLocker.
     */
    private BitLockerRecoveryOptions recoveryOptions;
    /**
     * This policy setting determines whether BitLocker protection is required for fixed data drives to be writable on a computer.
     */
    private Boolean requireEncryptionForWriteAccess;
    /**
     * Instantiates a new bitLockerFixedDrivePolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BitLockerFixedDrivePolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bitLockerFixedDrivePolicy
     */
    @javax.annotation.Nonnull
    public static BitLockerFixedDrivePolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BitLockerFixedDrivePolicy();
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
     * Gets the encryptionMethod property value. Select the encryption method for fixed drives. Possible values are: aesCbc128, aesCbc256, xtsAes128, xtsAes256.
     * @return a bitLockerEncryptionMethod
     */
    @javax.annotation.Nullable
    public BitLockerEncryptionMethod getEncryptionMethod() {
        return this.encryptionMethod;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("encryptionMethod", (n) -> { this.setEncryptionMethod(n.getEnumValue(BitLockerEncryptionMethod.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recoveryOptions", (n) -> { this.setRecoveryOptions(n.getObjectValue(BitLockerRecoveryOptions::createFromDiscriminatorValue)); });
        deserializerMap.put("requireEncryptionForWriteAccess", (n) -> { this.setRequireEncryptionForWriteAccess(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the recoveryOptions property value. This policy setting allows you to control how BitLocker-protected fixed data drives are recovered in the absence of the required credentials. This policy setting is applied when you turn on BitLocker.
     * @return a bitLockerRecoveryOptions
     */
    @javax.annotation.Nullable
    public BitLockerRecoveryOptions getRecoveryOptions() {
        return this.recoveryOptions;
    }
    /**
     * Gets the requireEncryptionForWriteAccess property value. This policy setting determines whether BitLocker protection is required for fixed data drives to be writable on a computer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequireEncryptionForWriteAccess() {
        return this.requireEncryptionForWriteAccess;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("encryptionMethod", this.getEncryptionMethod());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("recoveryOptions", this.getRecoveryOptions());
        writer.writeBooleanValue("requireEncryptionForWriteAccess", this.getRequireEncryptionForWriteAccess());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the encryptionMethod property value. Select the encryption method for fixed drives. Possible values are: aesCbc128, aesCbc256, xtsAes128, xtsAes256.
     * @param value Value to set for the encryptionMethod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEncryptionMethod(@javax.annotation.Nullable final BitLockerEncryptionMethod value) {
        this.encryptionMethod = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the recoveryOptions property value. This policy setting allows you to control how BitLocker-protected fixed data drives are recovered in the absence of the required credentials. This policy setting is applied when you turn on BitLocker.
     * @param value Value to set for the recoveryOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecoveryOptions(@javax.annotation.Nullable final BitLockerRecoveryOptions value) {
        this.recoveryOptions = value;
    }
    /**
     * Sets the requireEncryptionForWriteAccess property value. This policy setting determines whether BitLocker protection is required for fixed data drives to be writable on a computer.
     * @param value Value to set for the requireEncryptionForWriteAccess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequireEncryptionForWriteAccess(@javax.annotation.Nullable final Boolean value) {
        this.requireEncryptionForWriteAccess = value;
    }
}
