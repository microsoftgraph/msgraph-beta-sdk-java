package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TenantDetailedInformation extends Entity implements Parsable {
    /**
     * The city where the managed tenant is located. Optional. Read-only.
     */
    private String city;
    /**
     * The code for the country where the managed tenant is located. Optional. Read-only.
     */
    private String countryCode;
    /**
     * The name for the country where the managed tenant is located. Optional. Read-only.
     */
    private String countryName;
    /**
     * The default domain name for the managed tenant. Optional. Read-only.
     */
    private String defaultDomainName;
    /**
     * The display name for the managed tenant.
     */
    private String displayName;
    /**
     * The business industry associated with the managed tenant. Optional. Read-only.
     */
    private String industryName;
    /**
     * The region where the managed tenant is located. Optional. Read-only.
     */
    private String region;
    /**
     * The business segment associated with the managed tenant. Optional. Read-only.
     */
    private String segmentName;
    /**
     * The Azure Active Directory tenant identifier for the managed tenant.
     */
    private String tenantId;
    /**
     * The vertical associated with the managed tenant. Optional. Read-only.
     */
    private String verticalName;
    /**
     * Instantiates a new tenantDetailedInformation and sets the default values.
     */
    public TenantDetailedInformation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tenantDetailedInformation
     */
    @jakarta.annotation.Nonnull
    public static TenantDetailedInformation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantDetailedInformation();
    }
    /**
     * Gets the city property value. The city where the managed tenant is located. Optional. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the countryCode property value. The code for the country where the managed tenant is located. Optional. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCountryCode() {
        return this.countryCode;
    }
    /**
     * Gets the countryName property value. The name for the country where the managed tenant is located. Optional. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCountryName() {
        return this.countryName;
    }
    /**
     * Gets the defaultDomainName property value. The default domain name for the managed tenant. Optional. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDefaultDomainName() {
        return this.defaultDomainName;
    }
    /**
     * Gets the displayName property value. The display name for the managed tenant.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
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
    @jakarta.annotation.Nullable
    public String getIndustryName() {
        return this.industryName;
    }
    /**
     * Gets the region property value. The region where the managed tenant is located. Optional. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRegion() {
        return this.region;
    }
    /**
     * Gets the segmentName property value. The business segment associated with the managed tenant. Optional. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSegmentName() {
        return this.segmentName;
    }
    /**
     * Gets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the verticalName property value. The vertical associated with the managed tenant. Optional. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getVerticalName() {
        return this.verticalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the countryCode property value. The code for the country where the managed tenant is located. Optional. Read-only.
     * @param value Value to set for the countryCode property.
     */
    public void setCountryCode(@jakarta.annotation.Nullable final String value) {
        this.countryCode = value;
    }
    /**
     * Sets the countryName property value. The name for the country where the managed tenant is located. Optional. Read-only.
     * @param value Value to set for the countryName property.
     */
    public void setCountryName(@jakarta.annotation.Nullable final String value) {
        this.countryName = value;
    }
    /**
     * Sets the defaultDomainName property value. The default domain name for the managed tenant. Optional. Read-only.
     * @param value Value to set for the defaultDomainName property.
     */
    public void setDefaultDomainName(@jakarta.annotation.Nullable final String value) {
        this.defaultDomainName = value;
    }
    /**
     * Sets the displayName property value. The display name for the managed tenant.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the industryName property value. The business industry associated with the managed tenant. Optional. Read-only.
     * @param value Value to set for the industryName property.
     */
    public void setIndustryName(@jakarta.annotation.Nullable final String value) {
        this.industryName = value;
    }
    /**
     * Sets the region property value. The region where the managed tenant is located. Optional. Read-only.
     * @param value Value to set for the region property.
     */
    public void setRegion(@jakarta.annotation.Nullable final String value) {
        this.region = value;
    }
    /**
     * Sets the segmentName property value. The business segment associated with the managed tenant. Optional. Read-only.
     * @param value Value to set for the segmentName property.
     */
    public void setSegmentName(@jakarta.annotation.Nullable final String value) {
        this.segmentName = value;
    }
    /**
     * Sets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the verticalName property value. The vertical associated with the managed tenant. Optional. Read-only.
     * @param value Value to set for the verticalName property.
     */
    public void setVerticalName(@jakarta.annotation.Nullable final String value) {
        this.verticalName = value;
    }
}
