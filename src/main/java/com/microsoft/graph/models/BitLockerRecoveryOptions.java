package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * BitLocker Recovery Options.
 */
public class BitLockerRecoveryOptions implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Indicates whether to block certificate-based data recovery agent. */
    private Boolean blockDataRecoveryAgent;
    /** Indicates whether or not to enable BitLocker until recovery information is stored in AD DS. */
    private Boolean enableBitLockerAfterRecoveryInformationToStore;
    /** Indicates whether or not to allow BitLocker recovery information to store in AD DS. */
    private Boolean enableRecoveryInformationSaveToStore;
    /** Indicates whether or not to allow showing recovery options in BitLocker Setup Wizard for fixed or system disk. */
    private Boolean hideRecoveryOptions;
    /** The OdataType property */
    private String odataType;
    /** BitLockerRecoveryInformationType types */
    private BitLockerRecoveryInformationType recoveryInformationToStore;
    /** Possible values of the ConfigurationUsage list. */
    private ConfigurationUsage recoveryKeyUsage;
    /** Possible values of the ConfigurationUsage list. */
    private ConfigurationUsage recoveryPasswordUsage;
    /**
     * Instantiates a new bitLockerRecoveryOptions and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.additionalData;
    }
    /**
     * Gets the blockDataRecoveryAgent property value. Indicates whether to block certificate-based data recovery agent.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlockDataRecoveryAgent() {
        return this.blockDataRecoveryAgent;
    }
    /**
     * Gets the enableBitLockerAfterRecoveryInformationToStore property value. Indicates whether or not to enable BitLocker until recovery information is stored in AD DS.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableBitLockerAfterRecoveryInformationToStore() {
        return this.enableBitLockerAfterRecoveryInformationToStore;
    }
    /**
     * Gets the enableRecoveryInformationSaveToStore property value. Indicates whether or not to allow BitLocker recovery information to store in AD DS.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableRecoveryInformationSaveToStore() {
        return this.enableRecoveryInformationSaveToStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("blockDataRecoveryAgent", (n) -> { this.setBlockDataRecoveryAgent(n.getBooleanValue()); });
        deserializerMap.put("enableBitLockerAfterRecoveryInformationToStore", (n) -> { this.setEnableBitLockerAfterRecoveryInformationToStore(n.getBooleanValue()); });
        deserializerMap.put("enableRecoveryInformationSaveToStore", (n) -> { this.setEnableRecoveryInformationSaveToStore(n.getBooleanValue()); });
        deserializerMap.put("hideRecoveryOptions", (n) -> { this.setHideRecoveryOptions(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recoveryInformationToStore", (n) -> { this.setRecoveryInformationToStore(n.getEnumValue(BitLockerRecoveryInformationType.class)); });
        deserializerMap.put("recoveryKeyUsage", (n) -> { this.setRecoveryKeyUsage(n.getEnumValue(ConfigurationUsage.class)); });
        deserializerMap.put("recoveryPasswordUsage", (n) -> { this.setRecoveryPasswordUsage(n.getEnumValue(ConfigurationUsage.class)); });
        return deserializerMap;
    }
    /**
     * Gets the hideRecoveryOptions property value. Indicates whether or not to allow showing recovery options in BitLocker Setup Wizard for fixed or system disk.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHideRecoveryOptions() {
        return this.hideRecoveryOptions;
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
     * Gets the recoveryInformationToStore property value. BitLockerRecoveryInformationType types
     * @return a bitLockerRecoveryInformationType
     */
    @javax.annotation.Nullable
    public BitLockerRecoveryInformationType getRecoveryInformationToStore() {
        return this.recoveryInformationToStore;
    }
    /**
     * Gets the recoveryKeyUsage property value. Possible values of the ConfigurationUsage list.
     * @return a configurationUsage
     */
    @javax.annotation.Nullable
    public ConfigurationUsage getRecoveryKeyUsage() {
        return this.recoveryKeyUsage;
    }
    /**
     * Gets the recoveryPasswordUsage property value. Possible values of the ConfigurationUsage list.
     * @return a configurationUsage
     */
    @javax.annotation.Nullable
    public ConfigurationUsage getRecoveryPasswordUsage() {
        return this.recoveryPasswordUsage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("blockDataRecoveryAgent", this.getBlockDataRecoveryAgent());
        writer.writeBooleanValue("enableBitLockerAfterRecoveryInformationToStore", this.getEnableBitLockerAfterRecoveryInformationToStore());
        writer.writeBooleanValue("enableRecoveryInformationSaveToStore", this.getEnableRecoveryInformationSaveToStore());
        writer.writeBooleanValue("hideRecoveryOptions", this.getHideRecoveryOptions());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the blockDataRecoveryAgent property value. Indicates whether to block certificate-based data recovery agent.
     * @param value Value to set for the blockDataRecoveryAgent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlockDataRecoveryAgent(@javax.annotation.Nullable final Boolean value) {
        this.blockDataRecoveryAgent = value;
    }
    /**
     * Sets the enableBitLockerAfterRecoveryInformationToStore property value. Indicates whether or not to enable BitLocker until recovery information is stored in AD DS.
     * @param value Value to set for the enableBitLockerAfterRecoveryInformationToStore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableBitLockerAfterRecoveryInformationToStore(@javax.annotation.Nullable final Boolean value) {
        this.enableBitLockerAfterRecoveryInformationToStore = value;
    }
    /**
     * Sets the enableRecoveryInformationSaveToStore property value. Indicates whether or not to allow BitLocker recovery information to store in AD DS.
     * @param value Value to set for the enableRecoveryInformationSaveToStore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableRecoveryInformationSaveToStore(@javax.annotation.Nullable final Boolean value) {
        this.enableRecoveryInformationSaveToStore = value;
    }
    /**
     * Sets the hideRecoveryOptions property value. Indicates whether or not to allow showing recovery options in BitLocker Setup Wizard for fixed or system disk.
     * @param value Value to set for the hideRecoveryOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHideRecoveryOptions(@javax.annotation.Nullable final Boolean value) {
        this.hideRecoveryOptions = value;
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
     * Sets the recoveryInformationToStore property value. BitLockerRecoveryInformationType types
     * @param value Value to set for the recoveryInformationToStore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecoveryInformationToStore(@javax.annotation.Nullable final BitLockerRecoveryInformationType value) {
        this.recoveryInformationToStore = value;
    }
    /**
     * Sets the recoveryKeyUsage property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the recoveryKeyUsage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecoveryKeyUsage(@javax.annotation.Nullable final ConfigurationUsage value) {
        this.recoveryKeyUsage = value;
    }
    /**
     * Sets the recoveryPasswordUsage property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the recoveryPasswordUsage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecoveryPasswordUsage(@javax.annotation.Nullable final ConfigurationUsage value) {
        this.recoveryPasswordUsage = value;
    }
}
