package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The security baseline compliance state of a setting for a device */
public class SecurityBaselineSettingState extends Entity implements Parsable {
    /** The policies that contribute to this setting instance */
    private java.util.List<SecurityBaselineContributingPolicy> _contributingPolicies;
    /** The error code if the setting is in error state */
    private String _errorCode;
    /** The setting category id which this setting belongs to */
    private String _settingCategoryId;
    /** The setting category name which this setting belongs to */
    private String _settingCategoryName;
    /** The setting id guid */
    private String _settingId;
    /** The setting name that is being reported */
    private String _settingName;
    /** The policies that contribute to this setting instance */
    private java.util.List<SettingSource> _sourcePolicies;
    /** Security Baseline Compliance State */
    private SecurityBaselineComplianceState _state;
    /**
     * Instantiates a new securityBaselineSettingState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SecurityBaselineSettingState() {
        super();
        this.setOdataType("#microsoft.graph.securityBaselineSettingState");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a securityBaselineSettingState
     */
    @javax.annotation.Nonnull
    public static SecurityBaselineSettingState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityBaselineSettingState();
    }
    /**
     * Gets the contributingPolicies property value. The policies that contribute to this setting instance
     * @return a securityBaselineContributingPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<SecurityBaselineContributingPolicy> getContributingPolicies() {
        return this._contributingPolicies;
    }
    /**
     * Gets the errorCode property value. The error code if the setting is in error state
     * @return a string
     */
    @javax.annotation.Nullable
    public String getErrorCode() {
        return this._errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SecurityBaselineSettingState currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contributingPolicies", (n) -> { currentObject.setContributingPolicies(n.getCollectionOfObjectValues(SecurityBaselineContributingPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("errorCode", (n) -> { currentObject.setErrorCode(n.getStringValue()); });
        deserializerMap.put("settingCategoryId", (n) -> { currentObject.setSettingCategoryId(n.getStringValue()); });
        deserializerMap.put("settingCategoryName", (n) -> { currentObject.setSettingCategoryName(n.getStringValue()); });
        deserializerMap.put("settingId", (n) -> { currentObject.setSettingId(n.getStringValue()); });
        deserializerMap.put("settingName", (n) -> { currentObject.setSettingName(n.getStringValue()); });
        deserializerMap.put("sourcePolicies", (n) -> { currentObject.setSourcePolicies(n.getCollectionOfObjectValues(SettingSource::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { currentObject.setState(n.getEnumValue(SecurityBaselineComplianceState.class)); });
        return deserializerMap
    }
    /**
     * Gets the settingCategoryId property value. The setting category id which this setting belongs to
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingCategoryId() {
        return this._settingCategoryId;
    }
    /**
     * Gets the settingCategoryName property value. The setting category name which this setting belongs to
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingCategoryName() {
        return this._settingCategoryName;
    }
    /**
     * Gets the settingId property value. The setting id guid
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingId() {
        return this._settingId;
    }
    /**
     * Gets the settingName property value. The setting name that is being reported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingName() {
        return this._settingName;
    }
    /**
     * Gets the sourcePolicies property value. The policies that contribute to this setting instance
     * @return a settingSource
     */
    @javax.annotation.Nullable
    public java.util.List<SettingSource> getSourcePolicies() {
        return this._sourcePolicies;
    }
    /**
     * Gets the state property value. Security Baseline Compliance State
     * @return a securityBaselineComplianceState
     */
    @javax.annotation.Nullable
    public SecurityBaselineComplianceState getState() {
        return this._state;
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
        writer.writeCollectionOfObjectValues("contributingPolicies", this.getContributingPolicies());
        writer.writeStringValue("errorCode", this.getErrorCode());
        writer.writeStringValue("settingCategoryId", this.getSettingCategoryId());
        writer.writeStringValue("settingCategoryName", this.getSettingCategoryName());
        writer.writeStringValue("settingId", this.getSettingId());
        writer.writeStringValue("settingName", this.getSettingName());
        writer.writeCollectionOfObjectValues("sourcePolicies", this.getSourcePolicies());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the contributingPolicies property value. The policies that contribute to this setting instance
     * @param value Value to set for the contributingPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContributingPolicies(@javax.annotation.Nullable final java.util.List<SecurityBaselineContributingPolicy> value) {
        this._contributingPolicies = value;
    }
    /**
     * Sets the errorCode property value. The error code if the setting is in error state
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorCode(@javax.annotation.Nullable final String value) {
        this._errorCode = value;
    }
    /**
     * Sets the settingCategoryId property value. The setting category id which this setting belongs to
     * @param value Value to set for the settingCategoryId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingCategoryId(@javax.annotation.Nullable final String value) {
        this._settingCategoryId = value;
    }
    /**
     * Sets the settingCategoryName property value. The setting category name which this setting belongs to
     * @param value Value to set for the settingCategoryName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingCategoryName(@javax.annotation.Nullable final String value) {
        this._settingCategoryName = value;
    }
    /**
     * Sets the settingId property value. The setting id guid
     * @param value Value to set for the settingId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingId(@javax.annotation.Nullable final String value) {
        this._settingId = value;
    }
    /**
     * Sets the settingName property value. The setting name that is being reported
     * @param value Value to set for the settingName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingName(@javax.annotation.Nullable final String value) {
        this._settingName = value;
    }
    /**
     * Sets the sourcePolicies property value. The policies that contribute to this setting instance
     * @param value Value to set for the sourcePolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourcePolicies(@javax.annotation.Nullable final java.util.List<SettingSource> value) {
        this._sourcePolicies = value;
    }
    /**
     * Sets the state property value. Security Baseline Compliance State
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final SecurityBaselineComplianceState value) {
        this._state = value;
    }
}
