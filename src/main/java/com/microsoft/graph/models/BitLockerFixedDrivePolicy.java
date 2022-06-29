package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** BitLocker Fixed Drive Policies. */
public class BitLockerFixedDrivePolicy implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Select the encryption method for fixed drives. Possible values are: aesCbc128, aesCbc256, xtsAes128, xtsAes256. */
    private BitLockerEncryptionMethod _encryptionMethod;
    /** This policy setting allows you to control how BitLocker-protected fixed data drives are recovered in the absence of the required credentials. This policy setting is applied when you turn on BitLocker. */
    private BitLockerRecoveryOptions _recoveryOptions;
    /** This policy setting determines whether BitLocker protection is required for fixed data drives to be writable on a computer. */
    private Boolean _requireEncryptionForWriteAccess;
    /**
     * Instantiates a new bitLockerFixedDrivePolicy and sets the default values.
     * @return a void
     */
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
        return this._additionalData;
    }
    /**
     * Gets the encryptionMethod property value. Select the encryption method for fixed drives. Possible values are: aesCbc128, aesCbc256, xtsAes128, xtsAes256.
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
        final BitLockerFixedDrivePolicy currentObject = this;
        return new HashMap<>(3) {{
            this.put("encryptionMethod", (n) -> { currentObject.setEncryptionMethod(n.getEnumValue(BitLockerEncryptionMethod.class)); });
            this.put("recoveryOptions", (n) -> { currentObject.setRecoveryOptions(n.getObjectValue(BitLockerRecoveryOptions::createFromDiscriminatorValue)); });
            this.put("requireEncryptionForWriteAccess", (n) -> { currentObject.setRequireEncryptionForWriteAccess(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the recoveryOptions property value. This policy setting allows you to control how BitLocker-protected fixed data drives are recovered in the absence of the required credentials. This policy setting is applied when you turn on BitLocker.
     * @return a bitLockerRecoveryOptions
     */
    @javax.annotation.Nullable
    public BitLockerRecoveryOptions getRecoveryOptions() {
        return this._recoveryOptions;
    }
    /**
     * Gets the requireEncryptionForWriteAccess property value. This policy setting determines whether BitLocker protection is required for fixed data drives to be writable on a computer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequireEncryptionForWriteAccess() {
        return this._requireEncryptionForWriteAccess;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("encryptionMethod", this.getEncryptionMethod());
        writer.writeObjectValue("recoveryOptions", this.getRecoveryOptions());
        writer.writeBooleanValue("requireEncryptionForWriteAccess", this.getRequireEncryptionForWriteAccess());
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
     * Sets the encryptionMethod property value. Select the encryption method for fixed drives. Possible values are: aesCbc128, aesCbc256, xtsAes128, xtsAes256.
     * @param value Value to set for the encryptionMethod property.
     * @return a void
     */
    public void setEncryptionMethod(@javax.annotation.Nullable final BitLockerEncryptionMethod value) {
        this._encryptionMethod = value;
    }
    /**
     * Sets the recoveryOptions property value. This policy setting allows you to control how BitLocker-protected fixed data drives are recovered in the absence of the required credentials. This policy setting is applied when you turn on BitLocker.
     * @param value Value to set for the recoveryOptions property.
     * @return a void
     */
    public void setRecoveryOptions(@javax.annotation.Nullable final BitLockerRecoveryOptions value) {
        this._recoveryOptions = value;
    }
    /**
     * Sets the requireEncryptionForWriteAccess property value. This policy setting determines whether BitLocker protection is required for fixed data drives to be writable on a computer.
     * @param value Value to set for the requireEncryptionForWriteAccess property.
     * @return a void
     */
    public void setRequireEncryptionForWriteAccess(@javax.annotation.Nullable final Boolean value) {
        this._requireEncryptionForWriteAccess = value;
    }
}
