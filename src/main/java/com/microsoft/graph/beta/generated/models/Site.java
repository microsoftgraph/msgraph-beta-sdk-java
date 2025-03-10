package com.microsoft.graph.beta.models;

import com.microsoft.graph.beta.models.termstore.Store;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Site extends BaseItem implements Parsable {
    /**
     * Instantiates a new {@link Site} and sets the default values.
     */
    public Site() {
        super();
        this.setOdataType("#microsoft.graph.site");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Site}
     */
    @jakarta.annotation.Nonnull
    public static Site createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Site();
    }
    /**
     * Gets the analytics property value. Analytics about the view activities that took place on this site.
     * @return a {@link ItemAnalytics}
     */
    @jakarta.annotation.Nullable
    public ItemAnalytics getAnalytics() {
        return this.backingStore.get("analytics");
    }
    /**
     * Gets the columns property value. The collection of column definitions reusable across lists under this site.
     * @return a {@link java.util.List<ColumnDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ColumnDefinition> getColumns() {
        return this.backingStore.get("columns");
    }
    /**
     * Gets the contentModels property value. The collection of content models applied to this site.
     * @return a {@link java.util.List<ContentModel>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ContentModel> getContentModels() {
        return this.backingStore.get("contentModels");
    }
    /**
     * Gets the contentTypes property value. The collection of content types defined for this site.
     * @return a {@link java.util.List<ContentType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ContentType> getContentTypes() {
        return this.backingStore.get("contentTypes");
    }
    /**
     * Gets the deleted property value. The deleted property
     * @return a {@link Deleted}
     */
    @jakarta.annotation.Nullable
    public Deleted getDeleted() {
        return this.backingStore.get("deleted");
    }
    /**
     * Gets the displayName property value. The full title for the site. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the documentProcessingJobs property value. The document processing jobs running on this site.
     * @return a {@link java.util.List<DocumentProcessingJob>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DocumentProcessingJob> getDocumentProcessingJobs() {
        return this.backingStore.get("documentProcessingJobs");
    }
    /**
     * Gets the drive property value. The default drive (document library) for this site.
     * @return a {@link Drive}
     */
    @jakarta.annotation.Nullable
    public Drive getDrive() {
        return this.backingStore.get("drive");
    }
    /**
     * Gets the drives property value. The collection of drives (document libraries) under this site.
     * @return a {@link java.util.List<Drive>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Drive> getDrives() {
        return this.backingStore.get("drives");
    }
    /**
     * Gets the externalColumns property value. The collection of column definitions available in the site that is referenced from the sites in the parent hierarchy of the current site.
     * @return a {@link java.util.List<ColumnDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ColumnDefinition> getExternalColumns() {
        return this.backingStore.get("externalColumns");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("analytics", (n) -> { this.setAnalytics(n.getObjectValue(ItemAnalytics::createFromDiscriminatorValue)); });
        deserializerMap.put("columns", (n) -> { this.setColumns(n.getCollectionOfObjectValues(ColumnDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("contentModels", (n) -> { this.setContentModels(n.getCollectionOfObjectValues(ContentModel::createFromDiscriminatorValue)); });
        deserializerMap.put("contentTypes", (n) -> { this.setContentTypes(n.getCollectionOfObjectValues(ContentType::createFromDiscriminatorValue)); });
        deserializerMap.put("deleted", (n) -> { this.setDeleted(n.getObjectValue(Deleted::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("documentProcessingJobs", (n) -> { this.setDocumentProcessingJobs(n.getCollectionOfObjectValues(DocumentProcessingJob::createFromDiscriminatorValue)); });
        deserializerMap.put("drive", (n) -> { this.setDrive(n.getObjectValue(Drive::createFromDiscriminatorValue)); });
        deserializerMap.put("drives", (n) -> { this.setDrives(n.getCollectionOfObjectValues(Drive::createFromDiscriminatorValue)); });
        deserializerMap.put("externalColumns", (n) -> { this.setExternalColumns(n.getCollectionOfObjectValues(ColumnDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("informationProtection", (n) -> { this.setInformationProtection(n.getObjectValue(InformationProtection::createFromDiscriminatorValue)); });
        deserializerMap.put("isPersonalSite", (n) -> { this.setIsPersonalSite(n.getBooleanValue()); });
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(BaseItem::createFromDiscriminatorValue)); });
        deserializerMap.put("lists", (n) -> { this.setLists(n.getCollectionOfObjectValues(List::createFromDiscriminatorValue)); });
        deserializerMap.put("onenote", (n) -> { this.setOnenote(n.getObjectValue(Onenote::createFromDiscriminatorValue)); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(RichLongRunningOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("pages", (n) -> { this.setPages(n.getCollectionOfObjectValues(BaseSitePage::createFromDiscriminatorValue)); });
        deserializerMap.put("pageTemplates", (n) -> { this.setPageTemplates(n.getCollectionOfObjectValues(PageTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("permissions", (n) -> { this.setPermissions(n.getCollectionOfObjectValues(Permission::createFromDiscriminatorValue)); });
        deserializerMap.put("recycleBin", (n) -> { this.setRecycleBin(n.getObjectValue(RecycleBin::createFromDiscriminatorValue)); });
        deserializerMap.put("root", (n) -> { this.setRoot(n.getObjectValue(Root::createFromDiscriminatorValue)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(SiteSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("sharepointIds", (n) -> { this.setSharepointIds(n.getObjectValue(SharepointIds::createFromDiscriminatorValue)); });
        deserializerMap.put("siteCollection", (n) -> { this.setSiteCollection(n.getObjectValue(SiteCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("sites", (n) -> { this.setSites(n.getCollectionOfObjectValues(Site::createFromDiscriminatorValue)); });
        deserializerMap.put("termStore", (n) -> { this.setTermStore(n.getObjectValue(Store::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the informationProtection property value. The informationProtection property
     * @return a {@link InformationProtection}
     */
    @jakarta.annotation.Nullable
    public InformationProtection getInformationProtection() {
        return this.backingStore.get("informationProtection");
    }
    /**
     * Gets the isPersonalSite property value. The isPersonalSite property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPersonalSite() {
        return this.backingStore.get("isPersonalSite");
    }
    /**
     * Gets the items property value. Used to address any item contained in this site. This collection can&apos;t be enumerated.
     * @return a {@link java.util.List<BaseItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<BaseItem> getItems() {
        return this.backingStore.get("items");
    }
    /**
     * Gets the lists property value. The collection of lists under this site.
     * @return a {@link java.util.List<List>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<List> getLists() {
        return this.backingStore.get("lists");
    }
    /**
     * Gets the onenote property value. The onenote property
     * @return a {@link Onenote}
     */
    @jakarta.annotation.Nullable
    public Onenote getOnenote() {
        return this.backingStore.get("onenote");
    }
    /**
     * Gets the operations property value. The collection of long running operations for the site.
     * @return a {@link java.util.List<RichLongRunningOperation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RichLongRunningOperation> getOperations() {
        return this.backingStore.get("operations");
    }
    /**
     * Gets the pages property value. The collection of pages in the baseSitePages list on this site.
     * @return a {@link java.util.List<BaseSitePage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<BaseSitePage> getPages() {
        return this.backingStore.get("pages");
    }
    /**
     * Gets the pageTemplates property value. The collection of page templates on this site.
     * @return a {@link java.util.List<PageTemplate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PageTemplate> getPageTemplates() {
        return this.backingStore.get("pageTemplates");
    }
    /**
     * Gets the permissions property value. The permissions associated with the site. Nullable.
     * @return a {@link java.util.List<Permission>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Permission> getPermissions() {
        return this.backingStore.get("permissions");
    }
    /**
     * Gets the recycleBin property value. A container for a collection of recycleBinItem resources in this site.
     * @return a {@link RecycleBin}
     */
    @jakarta.annotation.Nullable
    public RecycleBin getRecycleBin() {
        return this.backingStore.get("recycleBin");
    }
    /**
     * Gets the root property value. If present, provides the root site in the site collection. Read-only.
     * @return a {@link Root}
     */
    @jakarta.annotation.Nullable
    public Root getRoot() {
        return this.backingStore.get("root");
    }
    /**
     * Gets the settings property value. The settings on this site. Read-only.
     * @return a {@link SiteSettings}
     */
    @jakarta.annotation.Nullable
    public SiteSettings getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Gets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @return a {@link SharepointIds}
     */
    @jakarta.annotation.Nullable
    public SharepointIds getSharepointIds() {
        return this.backingStore.get("sharepointIds");
    }
    /**
     * Gets the siteCollection property value. Provides details about the site&apos;s site collection. Available only on the root site. Read-only.
     * @return a {@link SiteCollection}
     */
    @jakarta.annotation.Nullable
    public SiteCollection getSiteCollection() {
        return this.backingStore.get("siteCollection");
    }
    /**
     * Gets the sites property value. The collection of the sub-sites under this site.
     * @return a {@link java.util.List<Site>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Site> getSites() {
        return this.backingStore.get("sites");
    }
    /**
     * Gets the termStore property value. The termStore under this site.
     * @return a {@link Store}
     */
    @jakarta.annotation.Nullable
    public Store getTermStore() {
        return this.backingStore.get("termStore");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("analytics", this.getAnalytics());
        writer.writeCollectionOfObjectValues("columns", this.getColumns());
        writer.writeCollectionOfObjectValues("contentModels", this.getContentModels());
        writer.writeCollectionOfObjectValues("contentTypes", this.getContentTypes());
        writer.writeObjectValue("deleted", this.getDeleted());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("documentProcessingJobs", this.getDocumentProcessingJobs());
        writer.writeObjectValue("drive", this.getDrive());
        writer.writeCollectionOfObjectValues("drives", this.getDrives());
        writer.writeCollectionOfObjectValues("externalColumns", this.getExternalColumns());
        writer.writeObjectValue("informationProtection", this.getInformationProtection());
        writer.writeBooleanValue("isPersonalSite", this.getIsPersonalSite());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeCollectionOfObjectValues("lists", this.getLists());
        writer.writeObjectValue("onenote", this.getOnenote());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeCollectionOfObjectValues("pages", this.getPages());
        writer.writeCollectionOfObjectValues("pageTemplates", this.getPageTemplates());
        writer.writeCollectionOfObjectValues("permissions", this.getPermissions());
        writer.writeObjectValue("recycleBin", this.getRecycleBin());
        writer.writeObjectValue("root", this.getRoot());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeObjectValue("sharepointIds", this.getSharepointIds());
        writer.writeObjectValue("siteCollection", this.getSiteCollection());
        writer.writeCollectionOfObjectValues("sites", this.getSites());
        writer.writeObjectValue("termStore", this.getTermStore());
    }
    /**
     * Sets the analytics property value. Analytics about the view activities that took place on this site.
     * @param value Value to set for the analytics property.
     */
    public void setAnalytics(@jakarta.annotation.Nullable final ItemAnalytics value) {
        this.backingStore.set("analytics", value);
    }
    /**
     * Sets the columns property value. The collection of column definitions reusable across lists under this site.
     * @param value Value to set for the columns property.
     */
    public void setColumns(@jakarta.annotation.Nullable final java.util.List<ColumnDefinition> value) {
        this.backingStore.set("columns", value);
    }
    /**
     * Sets the contentModels property value. The collection of content models applied to this site.
     * @param value Value to set for the contentModels property.
     */
    public void setContentModels(@jakarta.annotation.Nullable final java.util.List<ContentModel> value) {
        this.backingStore.set("contentModels", value);
    }
    /**
     * Sets the contentTypes property value. The collection of content types defined for this site.
     * @param value Value to set for the contentTypes property.
     */
    public void setContentTypes(@jakarta.annotation.Nullable final java.util.List<ContentType> value) {
        this.backingStore.set("contentTypes", value);
    }
    /**
     * Sets the deleted property value. The deleted property
     * @param value Value to set for the deleted property.
     */
    public void setDeleted(@jakarta.annotation.Nullable final Deleted value) {
        this.backingStore.set("deleted", value);
    }
    /**
     * Sets the displayName property value. The full title for the site. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the documentProcessingJobs property value. The document processing jobs running on this site.
     * @param value Value to set for the documentProcessingJobs property.
     */
    public void setDocumentProcessingJobs(@jakarta.annotation.Nullable final java.util.List<DocumentProcessingJob> value) {
        this.backingStore.set("documentProcessingJobs", value);
    }
    /**
     * Sets the drive property value. The default drive (document library) for this site.
     * @param value Value to set for the drive property.
     */
    public void setDrive(@jakarta.annotation.Nullable final Drive value) {
        this.backingStore.set("drive", value);
    }
    /**
     * Sets the drives property value. The collection of drives (document libraries) under this site.
     * @param value Value to set for the drives property.
     */
    public void setDrives(@jakarta.annotation.Nullable final java.util.List<Drive> value) {
        this.backingStore.set("drives", value);
    }
    /**
     * Sets the externalColumns property value. The collection of column definitions available in the site that is referenced from the sites in the parent hierarchy of the current site.
     * @param value Value to set for the externalColumns property.
     */
    public void setExternalColumns(@jakarta.annotation.Nullable final java.util.List<ColumnDefinition> value) {
        this.backingStore.set("externalColumns", value);
    }
    /**
     * Sets the informationProtection property value. The informationProtection property
     * @param value Value to set for the informationProtection property.
     */
    public void setInformationProtection(@jakarta.annotation.Nullable final InformationProtection value) {
        this.backingStore.set("informationProtection", value);
    }
    /**
     * Sets the isPersonalSite property value. The isPersonalSite property
     * @param value Value to set for the isPersonalSite property.
     */
    public void setIsPersonalSite(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isPersonalSite", value);
    }
    /**
     * Sets the items property value. Used to address any item contained in this site. This collection can&apos;t be enumerated.
     * @param value Value to set for the items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<BaseItem> value) {
        this.backingStore.set("items", value);
    }
    /**
     * Sets the lists property value. The collection of lists under this site.
     * @param value Value to set for the lists property.
     */
    public void setLists(@jakarta.annotation.Nullable final java.util.List<List> value) {
        this.backingStore.set("lists", value);
    }
    /**
     * Sets the onenote property value. The onenote property
     * @param value Value to set for the onenote property.
     */
    public void setOnenote(@jakarta.annotation.Nullable final Onenote value) {
        this.backingStore.set("onenote", value);
    }
    /**
     * Sets the operations property value. The collection of long running operations for the site.
     * @param value Value to set for the operations property.
     */
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<RichLongRunningOperation> value) {
        this.backingStore.set("operations", value);
    }
    /**
     * Sets the pages property value. The collection of pages in the baseSitePages list on this site.
     * @param value Value to set for the pages property.
     */
    public void setPages(@jakarta.annotation.Nullable final java.util.List<BaseSitePage> value) {
        this.backingStore.set("pages", value);
    }
    /**
     * Sets the pageTemplates property value. The collection of page templates on this site.
     * @param value Value to set for the pageTemplates property.
     */
    public void setPageTemplates(@jakarta.annotation.Nullable final java.util.List<PageTemplate> value) {
        this.backingStore.set("pageTemplates", value);
    }
    /**
     * Sets the permissions property value. The permissions associated with the site. Nullable.
     * @param value Value to set for the permissions property.
     */
    public void setPermissions(@jakarta.annotation.Nullable final java.util.List<Permission> value) {
        this.backingStore.set("permissions", value);
    }
    /**
     * Sets the recycleBin property value. A container for a collection of recycleBinItem resources in this site.
     * @param value Value to set for the recycleBin property.
     */
    public void setRecycleBin(@jakarta.annotation.Nullable final RecycleBin value) {
        this.backingStore.set("recycleBin", value);
    }
    /**
     * Sets the root property value. If present, provides the root site in the site collection. Read-only.
     * @param value Value to set for the root property.
     */
    public void setRoot(@jakarta.annotation.Nullable final Root value) {
        this.backingStore.set("root", value);
    }
    /**
     * Sets the settings property value. The settings on this site. Read-only.
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final SiteSettings value) {
        this.backingStore.set("settings", value);
    }
    /**
     * Sets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @param value Value to set for the sharepointIds property.
     */
    public void setSharepointIds(@jakarta.annotation.Nullable final SharepointIds value) {
        this.backingStore.set("sharepointIds", value);
    }
    /**
     * Sets the siteCollection property value. Provides details about the site&apos;s site collection. Available only on the root site. Read-only.
     * @param value Value to set for the siteCollection property.
     */
    public void setSiteCollection(@jakarta.annotation.Nullable final SiteCollection value) {
        this.backingStore.set("siteCollection", value);
    }
    /**
     * Sets the sites property value. The collection of the sub-sites under this site.
     * @param value Value to set for the sites property.
     */
    public void setSites(@jakarta.annotation.Nullable final java.util.List<Site> value) {
        this.backingStore.set("sites", value);
    }
    /**
     * Sets the termStore property value. The termStore under this site.
     * @param value Value to set for the termStore property.
     */
    public void setTermStore(@jakarta.annotation.Nullable final Store value) {
        this.backingStore.set("termStore", value);
    }
}
