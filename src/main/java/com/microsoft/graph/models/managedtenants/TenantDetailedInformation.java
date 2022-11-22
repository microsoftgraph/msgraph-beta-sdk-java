package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class TenantDetailedInformation extends Entity implements Parsable {
    /** The city where the managed tenant is located. Optional. Read-only. */
    private String _city;
    /** The code for the country where the managed tenant is located. Optional. Read-only. */
    private String _countryCode;
    /** The name for the country where the managed tenant is located. Optional. Read-only. */
    private String _countryName;
    /** The default domain name for the managed tenant. Optional. Read-only. */
    private String _defaultDomainName;
    /** The display name for the managed tenant. */
    private String _displayName;
    /** The business industry associated with the managed tenant. Optional. Read-only. */
    private String _industryName;
    /** The region where the managed tenant is located. Optional. Read-only. */
    private String _region;
    /** The business segment associated with the managed tenant. Optional. Read-only. */
    private String _segmentName;
    /** The Azure Active Directory tenant identifier for the managed tenant. */
    private String _tenantId;
    /** The vertical associated with the managed tenant. Optional. Read-only. */
    private String _verticalName;
    /**
     * Instantiates a new tenantDetailedInformation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TenantDetailedInformation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tenantDetailedInformation
     */
    @javax.annotation.Nonnull
    public static TenantDetailedInformation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantDetailedInformation();
    }
    /**
     * Gets the city property value. The city where the managed tenant is located. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCity() {
        return this._city;
    }
    /**
     * Gets the countryCode property value. The code for the country where the managed tenant is located. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCountryCode() {
        return this._countryCode;
    }
    /**
     * Gets the countryName property value. The name for the country where the managed tenant is located. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCountryName() {
        return this._countryName;
    }
    /**
     * Gets the defaultDomainName property value. The default domain name for the managed tenant. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultDomainName() {
        return this._defaultDomainName;
    }
    /**
     * Gets the displayName property value. The display name for the managed tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("countryCode", (n) -> { this.setCountryCode(n.getStringValue()); });
        deserializerMap.put("countryName", (n) -> { this.setCountryName(n.getStringValue()); });
        deserializerMap.put("defaultDomainName", (n) -> { this.setDefaultDomainName(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("industryName", (n) -> { this.setIndustryName(n.getStringValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getStringValue()); });
        deserializerMap.put("segmentName", (n) -> { this.setSegmentName(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("verticalName", (n) -> { this.setVerticalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the industryName property value. The business industry associated with the managed tenant. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIndustryName() {
        return this._industryName;
    }
    /**
     * Gets the region property value. The region where the managed tenant is located. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegion() {
        return this._region;
    }
    /**
     * Gets the segmentName property value. The business segment associated with the managed tenant. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSegmentName() {
        return this._segmentName;
    }
    /**
     * Gets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
    }
    /**
     * Gets the verticalName property value. The vertical associated with the managed tenant. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVerticalName() {
        return this._verticalName;
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
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("countryCode", this.getCountryCode());
        writer.writeStringValue("countryName", this.getCountryName());
        writer.writeStringValue("defaultDomainName", this.getDefaultDomainName());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("industryName", this.getIndustryName());
        writer.writeStringValue("region", this.getRegion());
        writer.writeStringValue("segmentName", this.getSegmentName());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeStringValue("verticalName", this.getVerticalName());
    }
    /**
     * Sets the city property value. The city where the managed tenant is located. Optional. Read-only.
     * @param value Value to set for the city property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCity(@javax.annotation.Nullable final String value) {
        this._city = value;
    }
    /**
     * Sets the countryCode property value. The code for the country where the managed tenant is located. Optional. Read-only.
     * @param value Value to set for the countryCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountryCode(@javax.annotation.Nullable final String value) {
        this._countryCode = value;
    }
    /**
     * Sets the countryName property value. The name for the country where the managed tenant is located. Optional. Read-only.
     * @param value Value to set for the countryName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountryName(@javax.annotation.Nullable final String value) {
        this._countryName = value;
    }
    /**
     * Sets the defaultDomainName property value. The default domain name for the managed tenant. Optional. Read-only.
     * @param value Value to set for the defaultDomainName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultDomainName(@javax.annotation.Nullable final String value) {
        this._defaultDomainName = value;
    }
    /**
     * Sets the displayName property value. The display name for the managed tenant.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the industryName property value. The business industry associated with the managed tenant. Optional. Read-only.
     * @param value Value to set for the industryName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIndustryName(@javax.annotation.Nullable final String value) {
        this._industryName = value;
    }
    /**
     * Sets the region property value. The region where the managed tenant is located. Optional. Read-only.
     * @param value Value to set for the region property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegion(@javax.annotation.Nullable final String value) {
        this._region = value;
    }
    /**
     * Sets the segmentName property value. The business segment associated with the managed tenant. Optional. Read-only.
     * @param value Value to set for the segmentName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSegmentName(@javax.annotation.Nullable final String value) {
        this._segmentName = value;
    }
    /**
     * Sets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
    /**
     * Sets the verticalName property value. The vertical associated with the managed tenant. Optional. Read-only.
     * @param value Value to set for the verticalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVerticalName(@javax.annotation.Nullable final String value) {
        this._verticalName = value;
    }
}
