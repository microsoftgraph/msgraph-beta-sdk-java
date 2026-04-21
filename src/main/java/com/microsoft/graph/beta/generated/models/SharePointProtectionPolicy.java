package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointProtectionPolicy extends ProtectionPolicyBase implements Parsable {
    /**
     * Instantiates a new {@link SharePointProtectionPolicy} and sets the default values.
     */
    public SharePointProtectionPolicy() {
        super();
        this.setOdataType("#microsoft.graph.sharePointProtectionPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointProtectionPolicy}
     */
    @jakarta.annotation.Nonnull
    public static SharePointProtectionPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointProtectionPolicy();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("siteExclusionUnits", (n) -> { this.setSiteExclusionUnits(n.getCollectionOfObjectValues(SiteExclusionUnit::createFromDiscriminatorValue)); });
        deserializerMap.put("siteExclusionUnitsBulkAdditionJobs", (n) -> { this.setSiteExclusionUnitsBulkAdditionJobs(n.getCollectionOfObjectValues(SiteExclusionUnitsBulkAdditionJob::createFromDiscriminatorValue)); });
        deserializerMap.put("siteInclusionRules", (n) -> { this.setSiteInclusionRules(n.getCollectionOfObjectValues(SiteProtectionRule::createFromDiscriminatorValue)); });
        deserializerMap.put("siteProtectionUnits", (n) -> { this.setSiteProtectionUnits(n.getCollectionOfObjectValues(SiteProtectionUnit::createFromDiscriminatorValue)); });
        deserializerMap.put("siteProtectionUnitsBulkAdditionJobs", (n) -> { this.setSiteProtectionUnitsBulkAdditionJobs(n.getCollectionOfObjectValues(SiteProtectionUnitsBulkAdditionJob::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the siteExclusionUnits property value. The siteExclusionUnits property
     * @return a {@link java.util.List<SiteExclusionUnit>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SiteExclusionUnit> getSiteExclusionUnits() {
        return this.backingStore.get("siteExclusionUnits");
    }
    /**
     * Gets the siteExclusionUnitsBulkAdditionJobs property value. The siteExclusionUnitsBulkAdditionJobs property
     * @return a {@link java.util.List<SiteExclusionUnitsBulkAdditionJob>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SiteExclusionUnitsBulkAdditionJob> getSiteExclusionUnitsBulkAdditionJobs() {
        return this.backingStore.get("siteExclusionUnitsBulkAdditionJobs");
    }
    /**
     * Gets the siteInclusionRules property value. The rules associated with the SharePoint Protection policy.
     * @return a {@link java.util.List<SiteProtectionRule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SiteProtectionRule> getSiteInclusionRules() {
        return this.backingStore.get("siteInclusionRules");
    }
    /**
     * Gets the siteProtectionUnits property value. The protection units (sites) that are protected under the site protection policy.
     * @return a {@link java.util.List<SiteProtectionUnit>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SiteProtectionUnit> getSiteProtectionUnits() {
        return this.backingStore.get("siteProtectionUnits");
    }
    /**
     * Gets the siteProtectionUnitsBulkAdditionJobs property value. The siteProtectionUnitsBulkAdditionJobs property
     * @return a {@link java.util.List<SiteProtectionUnitsBulkAdditionJob>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SiteProtectionUnitsBulkAdditionJob> getSiteProtectionUnitsBulkAdditionJobs() {
        return this.backingStore.get("siteProtectionUnitsBulkAdditionJobs");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("siteExclusionUnits", this.getSiteExclusionUnits());
        writer.writeCollectionOfObjectValues("siteExclusionUnitsBulkAdditionJobs", this.getSiteExclusionUnitsBulkAdditionJobs());
        writer.writeCollectionOfObjectValues("siteInclusionRules", this.getSiteInclusionRules());
        writer.writeCollectionOfObjectValues("siteProtectionUnits", this.getSiteProtectionUnits());
        writer.writeCollectionOfObjectValues("siteProtectionUnitsBulkAdditionJobs", this.getSiteProtectionUnitsBulkAdditionJobs());
    }
    /**
     * Sets the siteExclusionUnits property value. The siteExclusionUnits property
     * @param value Value to set for the siteExclusionUnits property.
     */
    public void setSiteExclusionUnits(@jakarta.annotation.Nullable final java.util.List<SiteExclusionUnit> value) {
        this.backingStore.set("siteExclusionUnits", value);
    }
    /**
     * Sets the siteExclusionUnitsBulkAdditionJobs property value. The siteExclusionUnitsBulkAdditionJobs property
     * @param value Value to set for the siteExclusionUnitsBulkAdditionJobs property.
     */
    public void setSiteExclusionUnitsBulkAdditionJobs(@jakarta.annotation.Nullable final java.util.List<SiteExclusionUnitsBulkAdditionJob> value) {
        this.backingStore.set("siteExclusionUnitsBulkAdditionJobs", value);
    }
    /**
     * Sets the siteInclusionRules property value. The rules associated with the SharePoint Protection policy.
     * @param value Value to set for the siteInclusionRules property.
     */
    public void setSiteInclusionRules(@jakarta.annotation.Nullable final java.util.List<SiteProtectionRule> value) {
        this.backingStore.set("siteInclusionRules", value);
    }
    /**
     * Sets the siteProtectionUnits property value. The protection units (sites) that are protected under the site protection policy.
     * @param value Value to set for the siteProtectionUnits property.
     */
    public void setSiteProtectionUnits(@jakarta.annotation.Nullable final java.util.List<SiteProtectionUnit> value) {
        this.backingStore.set("siteProtectionUnits", value);
    }
    /**
     * Sets the siteProtectionUnitsBulkAdditionJobs property value. The siteProtectionUnitsBulkAdditionJobs property
     * @param value Value to set for the siteProtectionUnitsBulkAdditionJobs property.
     */
    public void setSiteProtectionUnitsBulkAdditionJobs(@jakarta.annotation.Nullable final java.util.List<SiteProtectionUnitsBulkAdditionJob> value) {
        this.backingStore.set("siteProtectionUnitsBulkAdditionJobs", value);
    }
}
