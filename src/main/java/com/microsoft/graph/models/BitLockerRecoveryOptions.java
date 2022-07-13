package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** BitLocker Recovery Options. */
public class BitLockerRecoveryOptions implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates whether to block certificate-based data recovery agent. */
    private Boolean _blockDataRecoveryAgent;
    /** Indicates whether or not to enable BitLocker until recovery information is stored in AD DS. */
    private Boolean _enableBitLockerAfterRecoveryInformationToStore;
    /** Indicates whether or not to allow BitLocker recovery information to store in AD DS. */
    private Boolean _enableRecoveryInformationSaveToStore;
    /** Indicates whether or not to allow showing recovery options in BitLocker Setup Wizard for fixed or system disk. */
    private Boolean _hideRecoveryOptions;
    /** BitLockerRecoveryInformationType types */
    private BitLockerRecoveryInformationType _recoveryInformationToStore;
    /** Possible values of the ConfigurationUsage list. */
    private ConfigurationUsage _recoveryKeyUsage;
    /** Possible values of the ConfigurationUsage list. */
    private ConfigurationUsage _recoveryPasswordUsage;
    /**
     * Instantiates a new bitLockerRecoveryOptions and sets the default values.
     * @return a void
     */
    public BitLockerRecoveryOptions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bitLockerRecoveryOptions
     */
    @javax.annotation.Nonnull
    public static BitLockerRecoveryOptions createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BitLockerRecoveryOptions();
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
     * Gets the blockDataRecoveryAgent property value. Indicates whether to block certificate-based data recovery agent.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlockDataRecoveryAgent() {
        return this._blockDataRecoveryAgent;
    }
    /**
     * Gets the enableBitLockerAfterRecoveryInformationToStore property value. Indicates whether or not to enable BitLocker until recovery information is stored in AD DS.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableBitLockerAfterRecoveryInformationToStore() {
        return this._enableBitLockerAfterRecoveryInformationToStore;
    }
    /**
     * Gets the enableRecoveryInformationSaveToStore property value. Indicates whether or not to allow BitLocker recovery information to store in AD DS.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableRecoveryInformationSaveToStore() {
        return this._enableRecoveryInformationSaveToStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BitLockerRecoveryOptions currentObject = this;
        return new HashMap<>(7) {{
            this.put("blockDataRecoveryAgent", (n) -> { currentObject.setBlockDataRecoveryAgent(n.getBooleanValue()); });
            this.put("enableBitLockerAfterRecoveryInformationToStore", (n) -> { currentObject.setEnableBitLockerAfterRecoveryInformationToStore(n.getBooleanValue()); });
            this.put("enableRecoveryInformationSaveToStore", (n) -> { currentObject.setEnableRecoveryInformationSaveToStore(n.getBooleanValue()); });
            this.put("hideRecoveryOptions", (n) -> { currentObject.setHideRecoveryOptions(n.getBooleanValue()); });
            this.put("recoveryInformationToStore", (n) -> { currentObject.setRecoveryInformationToStore(n.getEnumValue(BitLockerRecoveryInformationType.class)); });
            this.put("recoveryKeyUsage", (n) -> { currentObject.setRecoveryKeyUsage(n.getEnumValue(ConfigurationUsage.class)); });
            this.put("recoveryPasswordUsage", (n) -> { currentObject.setRecoveryPasswordUsage(n.getEnumValue(ConfigurationUsage.class)); });
        }};
    }
    /**
     * Gets the hideRecoveryOptions property value. Indicates whether or not to allow showing recovery options in BitLocker Setup Wizard for fixed or system disk.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHideRecoveryOptions() {
        return this._hideRecoveryOptions;
    }
    /**
     * Gets the recoveryInformationToStore property value. BitLockerRecoveryInformationType types
     * @return a bitLockerRecoveryInformationType
     */
    @javax.annotation.Nullable
    public BitLockerRecoveryInformationType getRecoveryInformationToStore() {
        return this._recoveryInformationToStore;
    }
    /**
     * Gets the recoveryKeyUsage property value. Possible values of the ConfigurationUsage list.
     * @return a configurationUsage
     */
    @javax.annotation.Nullable
    public ConfigurationUsage getRecoveryKeyUsage() {
        return this._recoveryKeyUsage;
    }
    /**
     * Gets the recoveryPasswordUsage property value. Possible values of the ConfigurationUsage list.
     * @return a configurationUsage
     */
    @javax.annotation.Nullable
    public ConfigurationUsage getRecoveryPasswordUsage() {
        return this._recoveryPasswordUsage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("blockDataRecoveryAgent", this.getBlockDataRecoveryAgent());
        writer.writeBooleanValue("enableBitLockerAfterRecoveryInformationToStore", this.getEnableBitLockerAfterRecoveryInformationToStore());
        writer.writeBooleanValue("enableRecoveryInformationSaveToStore", this.getEnableRecoveryInformationSaveToStore());
        writer.writeBooleanValue("hideRecoveryOptions", this.getHideRecoveryOptions());
        writer.writeEnumValue("recoveryInformationToStore", this.getRecoveryInformationToStore());
        writer.writeEnumValue("recoveryKeyUsage", this.getRecoveryKeyUsage());
        writer.writeEnumValue("recoveryPasswordUsage", this.getRecoveryPasswordUsage());
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
     * Sets the blockDataRecoveryAgent property value. Indicates whether to block certificate-based data recovery agent.
     * @param value Value to set for the blockDataRecoveryAgent property.
     * @return a void
     */
    public void setBlockDataRecoveryAgent(@javax.annotation.Nullable final Boolean value) {
        this._blockDataRecoveryAgent = value;
    }
    /**
     * Sets the enableBitLockerAfterRecoveryInformationToStore property value. Indicates whether or not to enable BitLocker until recovery information is stored in AD DS.
     * @param value Value to set for the enableBitLockerAfterRecoveryInformationToStore property.
     * @return a void
     */
    public void setEnableBitLockerAfterRecoveryInformationToStore(@javax.annotation.Nullable final Boolean value) {
        this._enableBitLockerAfterRecoveryInformationToStore = value;
    }
    /**
     * Sets the enableRecoveryInformationSaveToStore property value. Indicates whether or not to allow BitLocker recovery information to store in AD DS.
     * @param value Value to set for the enableRecoveryInformationSaveToStore property.
     * @return a void
     */
    public void setEnableRecoveryInformationSaveToStore(@javax.annotation.Nullable final Boolean value) {
        this._enableRecoveryInformationSaveToStore = value;
    }
    /**
     * Sets the hideRecoveryOptions property value. Indicates whether or not to allow showing recovery options in BitLocker Setup Wizard for fixed or system disk.
     * @param value Value to set for the hideRecoveryOptions property.
     * @return a void
     */
    public void setHideRecoveryOptions(@javax.annotation.Nullable final Boolean value) {
        this._hideRecoveryOptions = value;
    }
    /**
     * Sets the recoveryInformationToStore property value. BitLockerRecoveryInformationType types
     * @param value Value to set for the recoveryInformationToStore property.
     * @return a void
     */
    public void setRecoveryInformationToStore(@javax.annotation.Nullable final BitLockerRecoveryInformationType value) {
        this._recoveryInformationToStore = value;
    }
    /**
     * Sets the recoveryKeyUsage property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the recoveryKeyUsage property.
     * @return a void
     */
    public void setRecoveryKeyUsage(@javax.annotation.Nullable final ConfigurationUsage value) {
        this._recoveryKeyUsage = value;
    }
    /**
     * Sets the recoveryPasswordUsage property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the recoveryPasswordUsage property.
     * @return a void
     */
    public void setRecoveryPasswordUsage(@javax.annotation.Nullable final ConfigurationUsage value) {
        this._recoveryPasswordUsage = value;
    }
}
