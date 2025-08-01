package com.microsoft.graph.beta.models;

import com.microsoft.graph.beta.models.cloudlicensing.GroupCloudLicensing;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a Microsoft Entra group.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Group extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new {@link Group} and sets the default values.
     */
    public Group() {
        super();
        this.setOdataType("#microsoft.graph.group");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Group}
     */
    @jakarta.annotation.Nonnull
    public static Group createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Group();
    }
    /**
     * Gets the acceptedSenders property value. The list of users or groups allowed to create posts or calendar events in this group. If this list is non-empty, then only users or groups listed here can post.
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getAcceptedSenders() {
        return this.backingStore.get("acceptedSenders");
    }
    /**
     * Gets the accessType property value. Indicates the type of access to the group. Possible values are none, private, secret, and public.
     * @return a {@link GroupAccessType}
     */
    @jakarta.annotation.Nullable
    public GroupAccessType getAccessType() {
        return this.backingStore.get("accessType");
    }
    /**
     * Gets the allowExternalSenders property value. Indicates if people external to the organization can send messages to the group. The default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowExternalSenders() {
        return this.backingStore.get("allowExternalSenders");
    }
    /**
     * Gets the appRoleAssignments property value. Represents the app roles a group has been granted for an application. Supports $expand.
     * @return a {@link java.util.List<AppRoleAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppRoleAssignment> getAppRoleAssignments() {
        return this.backingStore.get("appRoleAssignments");
    }
    /**
     * Gets the assignedLabels property value. The list of sensitivity label pairs (label ID, label name) associated with a Microsoft 365 group. Returned only on $select. This property can be updated only in delegated scenarios where the caller requires both the Microsoft Graph permission and a supported administrator role.
     * @return a {@link java.util.List<AssignedLabel>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AssignedLabel> getAssignedLabels() {
        return this.backingStore.get("assignedLabels");
    }
    /**
     * Gets the assignedLicenses property value. The licenses that are assigned to the group. Returned only on $select. Supports $filter (eq). Read-only.
     * @return a {@link java.util.List<AssignedLicense>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AssignedLicense> getAssignedLicenses() {
        return this.backingStore.get("assignedLicenses");
    }
    /**
     * Gets the autoSubscribeNewMembers property value. Indicates if new members added to the group are auto-subscribed to receive email notifications. You can set this property in a PATCH request for the group; don&apos;t set it in the initial POST request that creates the group. Default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoSubscribeNewMembers() {
        return this.backingStore.get("autoSubscribeNewMembers");
    }
    /**
     * Gets the calendar property value. The group&apos;s calendar. Read-only.
     * @return a {@link Calendar}
     */
    @jakarta.annotation.Nullable
    public Calendar getCalendar() {
        return this.backingStore.get("calendar");
    }
    /**
     * Gets the calendarView property value. The calendar view for the calendar. Read-only.
     * @return a {@link java.util.List<Event>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Event> getCalendarView() {
        return this.backingStore.get("calendarView");
    }
    /**
     * Gets the classification property value. Describes a classification for the group (such as low, medium or high business impact). Valid values for this property are defined by creating a ClassificationList setting value, based on the template definition.Returned by default. Supports $filter (eq, ne, not, ge, le, startsWith).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClassification() {
        return this.backingStore.get("classification");
    }
    /**
     * Gets the cloudLicensing property value. The relationships of a group to cloud licensing resources.
     * @return a {@link GroupCloudLicensing}
     */
    @jakarta.annotation.Nullable
    public GroupCloudLicensing getCloudLicensing() {
        return this.backingStore.get("cloudLicensing");
    }
    /**
     * Gets the conversations property value. The group&apos;s conversations.
     * @return a {@link java.util.List<Conversation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Conversation> getConversations() {
        return this.backingStore.get("conversations");
    }
    /**
     * Gets the createdByAppId property value. App ID of the app used to create the group. Can be null for some groups. Returned by default. Read-only. Supports $filter (eq, ne, not, in, startsWith).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedByAppId() {
        return this.backingStore.get("createdByAppId");
    }
    /**
     * Gets the createdDateTime property value. Timestamp of when the group was created. The value can&apos;t be modified and is automatically populated when the group is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the createdOnBehalfOf property value. The user (or application) that created the group. Note: This isn&apos;t set if the user is an administrator. Read-only.
     * @return a {@link DirectoryObject}
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getCreatedOnBehalfOf() {
        return this.backingStore.get("createdOnBehalfOf");
    }
    /**
     * Gets the description property value. An optional description for the group. Returned by default. Supports $filter (eq, ne, not, ge, le, startsWith) and $search.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name for the group. Required. Maximum length is 256 characters. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the drive property value. The group&apos;s default drive. Read-only.
     * @return a {@link Drive}
     */
    @jakarta.annotation.Nullable
    public Drive getDrive() {
        return this.backingStore.get("drive");
    }
    /**
     * Gets the drives property value. The group&apos;s drives. Read-only.
     * @return a {@link java.util.List<Drive>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Drive> getDrives() {
        return this.backingStore.get("drives");
    }
    /**
     * Gets the endpoints property value. Endpoints for the group. Read-only. Nullable.
     * @return a {@link java.util.List<Endpoint>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Endpoint> getEndpoints() {
        return this.backingStore.get("endpoints");
    }
    /**
     * Gets the events property value. The group&apos;s events.
     * @return a {@link java.util.List<Event>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Event> getEvents() {
        return this.backingStore.get("events");
    }
    /**
     * Gets the expirationDateTime property value. Timestamp of when the group is set to expire. It is null for security groups, but for Microsoft 365 groups, it represents when the group is set to expire as defined in the groupLifecyclePolicy. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Supports $filter (eq, ne, not, ge, le, in). Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the group. Read-only. Nullable.
     * @return a {@link java.util.List<Extension>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this.backingStore.get("extensions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("acceptedSenders", (n) -> { this.setAcceptedSenders(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("accessType", (n) -> { this.setAccessType(n.getEnumValue(GroupAccessType::forValue)); });
        deserializerMap.put("allowExternalSenders", (n) -> { this.setAllowExternalSenders(n.getBooleanValue()); });
        deserializerMap.put("appRoleAssignments", (n) -> { this.setAppRoleAssignments(n.getCollectionOfObjectValues(AppRoleAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("assignedLabels", (n) -> { this.setAssignedLabels(n.getCollectionOfObjectValues(AssignedLabel::createFromDiscriminatorValue)); });
        deserializerMap.put("assignedLicenses", (n) -> { this.setAssignedLicenses(n.getCollectionOfObjectValues(AssignedLicense::createFromDiscriminatorValue)); });
        deserializerMap.put("autoSubscribeNewMembers", (n) -> { this.setAutoSubscribeNewMembers(n.getBooleanValue()); });
        deserializerMap.put("calendar", (n) -> { this.setCalendar(n.getObjectValue(Calendar::createFromDiscriminatorValue)); });
        deserializerMap.put("calendarView", (n) -> { this.setCalendarView(n.getCollectionOfObjectValues(Event::createFromDiscriminatorValue)); });
        deserializerMap.put("classification", (n) -> { this.setClassification(n.getStringValue()); });
        deserializerMap.put("cloudLicensing", (n) -> { this.setCloudLicensing(n.getObjectValue(GroupCloudLicensing::createFromDiscriminatorValue)); });
        deserializerMap.put("conversations", (n) -> { this.setConversations(n.getCollectionOfObjectValues(Conversation::createFromDiscriminatorValue)); });
        deserializerMap.put("createdByAppId", (n) -> { this.setCreatedByAppId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdOnBehalfOf", (n) -> { this.setCreatedOnBehalfOf(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("drive", (n) -> { this.setDrive(n.getObjectValue(Drive::createFromDiscriminatorValue)); });
        deserializerMap.put("drives", (n) -> { this.setDrives(n.getCollectionOfObjectValues(Drive::createFromDiscriminatorValue)); });
        deserializerMap.put("endpoints", (n) -> { this.setEndpoints(n.getCollectionOfObjectValues(Endpoint::createFromDiscriminatorValue)); });
        deserializerMap.put("events", (n) -> { this.setEvents(n.getCollectionOfObjectValues(Event::createFromDiscriminatorValue)); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
        deserializerMap.put("groupLifecyclePolicies", (n) -> { this.setGroupLifecyclePolicies(n.getCollectionOfObjectValues(GroupLifecyclePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("groupTypes", (n) -> { this.setGroupTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("hasMembersWithLicenseErrors", (n) -> { this.setHasMembersWithLicenseErrors(n.getBooleanValue()); });
        deserializerMap.put("hideFromAddressLists", (n) -> { this.setHideFromAddressLists(n.getBooleanValue()); });
        deserializerMap.put("hideFromOutlookClients", (n) -> { this.setHideFromOutlookClients(n.getBooleanValue()); });
        deserializerMap.put("infoCatalogs", (n) -> { this.setInfoCatalogs(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isArchived", (n) -> { this.setIsArchived(n.getBooleanValue()); });
        deserializerMap.put("isAssignableToRole", (n) -> { this.setIsAssignableToRole(n.getBooleanValue()); });
        deserializerMap.put("isFavorite", (n) -> { this.setIsFavorite(n.getBooleanValue()); });
        deserializerMap.put("isManagementRestricted", (n) -> { this.setIsManagementRestricted(n.getBooleanValue()); });
        deserializerMap.put("isSubscribedByMail", (n) -> { this.setIsSubscribedByMail(n.getBooleanValue()); });
        deserializerMap.put("licenseProcessingState", (n) -> { this.setLicenseProcessingState(n.getObjectValue(LicenseProcessingState::createFromDiscriminatorValue)); });
        deserializerMap.put("mail", (n) -> { this.setMail(n.getStringValue()); });
        deserializerMap.put("mailEnabled", (n) -> { this.setMailEnabled(n.getBooleanValue()); });
        deserializerMap.put("mailNickname", (n) -> { this.setMailNickname(n.getStringValue()); });
        deserializerMap.put("memberOf", (n) -> { this.setMemberOf(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("membershipRule", (n) -> { this.setMembershipRule(n.getStringValue()); });
        deserializerMap.put("membershipRuleProcessingState", (n) -> { this.setMembershipRuleProcessingState(n.getStringValue()); });
        deserializerMap.put("membershipRuleProcessingStatus", (n) -> { this.setMembershipRuleProcessingStatus(n.getObjectValue(MembershipRuleProcessingStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("membersWithLicenseErrors", (n) -> { this.setMembersWithLicenseErrors(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("onenote", (n) -> { this.setOnenote(n.getObjectValue(Onenote::createFromDiscriminatorValue)); });
        deserializerMap.put("onPremisesDomainName", (n) -> { this.setOnPremisesDomainName(n.getStringValue()); });
        deserializerMap.put("onPremisesLastSyncDateTime", (n) -> { this.setOnPremisesLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("onPremisesNetBiosName", (n) -> { this.setOnPremisesNetBiosName(n.getStringValue()); });
        deserializerMap.put("onPremisesProvisioningErrors", (n) -> { this.setOnPremisesProvisioningErrors(n.getCollectionOfObjectValues(OnPremisesProvisioningError::createFromDiscriminatorValue)); });
        deserializerMap.put("onPremisesSamAccountName", (n) -> { this.setOnPremisesSamAccountName(n.getStringValue()); });
        deserializerMap.put("onPremisesSecurityIdentifier", (n) -> { this.setOnPremisesSecurityIdentifier(n.getStringValue()); });
        deserializerMap.put("onPremisesSyncBehavior", (n) -> { this.setOnPremisesSyncBehavior(n.getObjectValue(OnPremisesSyncBehavior::createFromDiscriminatorValue)); });
        deserializerMap.put("onPremisesSyncEnabled", (n) -> { this.setOnPremisesSyncEnabled(n.getBooleanValue()); });
        deserializerMap.put("organizationId", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("owners", (n) -> { this.setOwners(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("permissionGrants", (n) -> { this.setPermissionGrants(n.getCollectionOfObjectValues(ResourceSpecificPermissionGrant::createFromDiscriminatorValue)); });
        deserializerMap.put("photo", (n) -> { this.setPhoto(n.getObjectValue(ProfilePhoto::createFromDiscriminatorValue)); });
        deserializerMap.put("photos", (n) -> { this.setPhotos(n.getCollectionOfObjectValues(ProfilePhoto::createFromDiscriminatorValue)); });
        deserializerMap.put("planner", (n) -> { this.setPlanner(n.getObjectValue(PlannerGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("preferredDataLocation", (n) -> { this.setPreferredDataLocation(n.getStringValue()); });
        deserializerMap.put("preferredLanguage", (n) -> { this.setPreferredLanguage(n.getStringValue()); });
        deserializerMap.put("proxyAddresses", (n) -> { this.setProxyAddresses(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("rejectedSenders", (n) -> { this.setRejectedSenders(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("renewedDateTime", (n) -> { this.setRenewedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("resourceBehaviorOptions", (n) -> { this.setResourceBehaviorOptions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("resourceProvisioningOptions", (n) -> { this.setResourceProvisioningOptions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("securityEnabled", (n) -> { this.setSecurityEnabled(n.getBooleanValue()); });
        deserializerMap.put("securityIdentifier", (n) -> { this.setSecurityIdentifier(n.getStringValue()); });
        deserializerMap.put("serviceProvisioningErrors", (n) -> { this.setServiceProvisioningErrors(n.getCollectionOfObjectValues(ServiceProvisioningError::createFromDiscriminatorValue)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getCollectionOfObjectValues(DirectorySetting::createFromDiscriminatorValue)); });
        deserializerMap.put("sites", (n) -> { this.setSites(n.getCollectionOfObjectValues(Site::createFromDiscriminatorValue)); });
        deserializerMap.put("team", (n) -> { this.setTeam(n.getObjectValue(Team::createFromDiscriminatorValue)); });
        deserializerMap.put("theme", (n) -> { this.setTheme(n.getStringValue()); });
        deserializerMap.put("threads", (n) -> { this.setThreads(n.getCollectionOfObjectValues(ConversationThread::createFromDiscriminatorValue)); });
        deserializerMap.put("transitiveMemberOf", (n) -> { this.setTransitiveMemberOf(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("transitiveMembers", (n) -> { this.setTransitiveMembers(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("uniqueName", (n) -> { this.setUniqueName(n.getStringValue()); });
        deserializerMap.put("unseenConversationsCount", (n) -> { this.setUnseenConversationsCount(n.getIntegerValue()); });
        deserializerMap.put("unseenCount", (n) -> { this.setUnseenCount(n.getIntegerValue()); });
        deserializerMap.put("unseenMessagesCount", (n) -> { this.setUnseenMessagesCount(n.getIntegerValue()); });
        deserializerMap.put("visibility", (n) -> { this.setVisibility(n.getStringValue()); });
        deserializerMap.put("writebackConfiguration", (n) -> { this.setWritebackConfiguration(n.getObjectValue(GroupWritebackConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupLifecyclePolicies property value. The collection of lifecycle policies for this group. Read-only. Nullable.
     * @return a {@link java.util.List<GroupLifecyclePolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupLifecyclePolicy> getGroupLifecyclePolicies() {
        return this.backingStore.get("groupLifecyclePolicies");
    }
    /**
     * Gets the groupTypes property value. Specifies the group type and its membership. If the collection contains Unified, the group is a Microsoft 365 group; otherwise, it&apos;s either a security group or a distribution group. For details, see groups overview.If the collection includes DynamicMembership, the group has dynamic membership; otherwise, membership is static. Returned by default. Supports $filter (eq, not).
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getGroupTypes() {
        return this.backingStore.get("groupTypes");
    }
    /**
     * Gets the hasMembersWithLicenseErrors property value. Indicates whether there are members in this group that have license errors from its group-based license assignment. This property is never returned on a GET operation. You can use it as a $filter argument to get groups that have members with license errors (that is, filter for this property being true).  Supports $filter (eq).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasMembersWithLicenseErrors() {
        return this.backingStore.get("hasMembersWithLicenseErrors");
    }
    /**
     * Gets the hideFromAddressLists property value. true if the group isn&apos;t displayed in certain parts of the Outlook user interface: in the Address Book, in address lists for selecting message recipients, and in the Browse Groups dialog for searching groups; false otherwise. The default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHideFromAddressLists() {
        return this.backingStore.get("hideFromAddressLists");
    }
    /**
     * Gets the hideFromOutlookClients property value. true if the group isn&apos;t displayed in Outlook clients, such as Outlook for Windows and Outlook on the web, false otherwise. The default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHideFromOutlookClients() {
        return this.backingStore.get("hideFromOutlookClients");
    }
    /**
     * Gets the infoCatalogs property value. Identifies the info segments assigned to the group. Returned by default. Supports $filter (eq, not, ge, le, startsWith).
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getInfoCatalogs() {
        return this.backingStore.get("infoCatalogs");
    }
    /**
     * Gets the isArchived property value. When a group is associated with a team, this property determines whether the team is in read-only mode. To read this property, use the /group/{groupId}/team endpoint or the Get team API. To update this property, use the archiveTeam and unarchiveTeam APIs.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsArchived() {
        return this.backingStore.get("isArchived");
    }
    /**
     * Gets the isAssignableToRole property value. Indicates whether this group can be assigned to a Microsoft Entra role. Optional. This property can only be set while creating the group and is immutable. If set to true, the securityEnabled property must also be set to true,  visibility must be Hidden, and the group cannot be a dynamic group (that is, groupTypes can&apos;t contain DynamicMembership). Only callers with at least the Privileged Role Administrator role can set this property. The caller must also be assigned the RoleManagement.ReadWrite.Directory permission to set this property or update the membership of such groups. For more, see Using a group to manage Microsoft Entra role assignmentsUsing this feature requires a Microsoft Entra ID P1 license. Returned by default. Supports $filter (eq, ne, not).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAssignableToRole() {
        return this.backingStore.get("isAssignableToRole");
    }
    /**
     * Gets the isFavorite property value. Indicates whether the user marked the group as favorite.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFavorite() {
        return this.backingStore.get("isFavorite");
    }
    /**
     * Gets the isManagementRestricted property value. Indicates whether the group is a member of a restricted management administrative unit. If not set, the default value is null and the default behavior is false. Read-only.  To manage a group member of a restricted management administrative unit, the administrator or calling app must be assigned a Microsoft Entra role at the scope of the restricted management administrative unit.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsManagementRestricted() {
        return this.backingStore.get("isManagementRestricted");
    }
    /**
     * Gets the isSubscribedByMail property value. Indicates whether the signed-in user is subscribed to receive email conversations. The default value is true. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSubscribedByMail() {
        return this.backingStore.get("isSubscribedByMail");
    }
    /**
     * Gets the licenseProcessingState property value. Indicates the status of the group license assignment to all group members. Possible values: QueuedForProcessing, ProcessingInProgress, and ProcessingComplete. Returned only on $select. Read-only.
     * @return a {@link LicenseProcessingState}
     */
    @jakarta.annotation.Nullable
    public LicenseProcessingState getLicenseProcessingState() {
        return this.backingStore.get("licenseProcessingState");
    }
    /**
     * Gets the mail property value. The SMTP address for the group, for example, &apos;serviceadmins@contoso.com&apos;. Returned by default. Read-only. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMail() {
        return this.backingStore.get("mail");
    }
    /**
     * Gets the mailEnabled property value. Specifies whether the group is mail-enabled. Required. Returned by default. Supports $filter (eq, ne, not, and eq on null values).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMailEnabled() {
        return this.backingStore.get("mailEnabled");
    }
    /**
     * Gets the mailNickname property value. The mail alias for the group, unique for Microsoft 365 groups in the organization. Maximum length is 64 characters. This property can contain only characters in the ASCII character set 0 - 127 except the following: @ () / [] &apos; ; : &lt;&gt; , SPACE. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMailNickname() {
        return this.backingStore.get("mailNickname");
    }
    /**
     * Gets the memberOf property value. Groups and administrative units that this group is a member of. HTTP Methods: GET (supported for all groups). Read-only. Nullable. Supports $expand.
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getMemberOf() {
        return this.backingStore.get("memberOf");
    }
    /**
     * Gets the members property value. Direct group members, who can be users, devices, other groups, or service principals. Supports the List members, Add member, and Remove member operations. Nullable. Supports $expand including nested $select. For example, /groups?$filter=startsWith(displayName,&apos;Role&apos;)&amp;$select=id,displayName&amp;$expand=members($select=id,userPrincipalName,displayName).
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getMembers() {
        return this.backingStore.get("members");
    }
    /**
     * Gets the membershipRule property value. The rule that determines members for this group if the group is a dynamic group (groupTypes contains DynamicMembership). For more information about the syntax of the membership rule, see Membership Rules syntax. Returned by default. Supports $filter (eq, ne, not, ge, le, startsWith).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMembershipRule() {
        return this.backingStore.get("membershipRule");
    }
    /**
     * Gets the membershipRuleProcessingState property value. Indicates whether the dynamic membership processing is on or paused. Possible values are On or Paused. Returned by default. Supports $filter (eq, ne, not, in).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMembershipRuleProcessingState() {
        return this.backingStore.get("membershipRuleProcessingState");
    }
    /**
     * Gets the membershipRuleProcessingStatus property value. Describes the processing status for rules-based dynamic groups. The property is null for non-rule-based dynamic groups or if the dynamic group processing has been paused. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}). Read-only.
     * @return a {@link MembershipRuleProcessingStatus}
     */
    @jakarta.annotation.Nullable
    public MembershipRuleProcessingStatus getMembershipRuleProcessingStatus() {
        return this.backingStore.get("membershipRuleProcessingStatus");
    }
    /**
     * Gets the membersWithLicenseErrors property value. A list of group members with license errors from this group-based license assignment. Read-only.
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getMembersWithLicenseErrors() {
        return this.backingStore.get("membersWithLicenseErrors");
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
     * Gets the onPremisesDomainName property value. Contains the on-premises domain FQDN, also called dnsDomainName synchronized from the on-premises directory. The property is only populated for customers synchronizing their on-premises directory to Microsoft Entra ID via Microsoft Entra Connect.Returned by default. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOnPremisesDomainName() {
        return this.backingStore.get("onPremisesDomainName");
    }
    /**
     * Gets the onPremisesLastSyncDateTime property value. Indicates the last time at which the group was synced with the on-premises directory.The Timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Read-only. Supports $filter (eq, ne, not, ge, le, in).
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getOnPremisesLastSyncDateTime() {
        return this.backingStore.get("onPremisesLastSyncDateTime");
    }
    /**
     * Gets the onPremisesNetBiosName property value. Contains the on-premises netBios name synchronized from the on-premises directory. The property is only populated for customers synchronizing their on-premises directory to Microsoft Entra ID via Microsoft Entra Connect.Returned by default. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOnPremisesNetBiosName() {
        return this.backingStore.get("onPremisesNetBiosName");
    }
    /**
     * Gets the onPremisesProvisioningErrors property value. Errors when using Microsoft synchronization product during provisioning. Returned by default. Supports $filter (eq, not).
     * @return a {@link java.util.List<OnPremisesProvisioningError>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OnPremisesProvisioningError> getOnPremisesProvisioningErrors() {
        return this.backingStore.get("onPremisesProvisioningErrors");
    }
    /**
     * Gets the onPremisesSamAccountName property value. Contains the on-premises SAM account name synchronized from the on-premises directory. The property is only populated for customers synchronizing their on-premises directory to Microsoft Entra ID via Microsoft Entra Connect.Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith). Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOnPremisesSamAccountName() {
        return this.backingStore.get("onPremisesSamAccountName");
    }
    /**
     * Gets the onPremisesSecurityIdentifier property value. Contains the on-premises security identifier (SID) for the group synchronized from on-premises to the cloud. Read-only. Returned by default. Supports $filter (eq including on null values).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOnPremisesSecurityIdentifier() {
        return this.backingStore.get("onPremisesSecurityIdentifier");
    }
    /**
     * Gets the onPremisesSyncBehavior property value. Indicates the state of synchronization for a group between the cloud and on-premises Active Directory. Supports $filter only with advanced query capabilities. For example, $filter=onPremisesSyncBehavior/isCloudManaged eq true&amp;$count=true.
     * @return a {@link OnPremisesSyncBehavior}
     */
    @jakarta.annotation.Nullable
    public OnPremisesSyncBehavior getOnPremisesSyncBehavior() {
        return this.backingStore.get("onPremisesSyncBehavior");
    }
    /**
     * Gets the onPremisesSyncEnabled property value. true if this group is synced from an on-premises directory; false if this group was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default). Returned by default. Read-only. Supports $filter (eq, ne, not, in, and eq on null values).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOnPremisesSyncEnabled() {
        return this.backingStore.get("onPremisesSyncEnabled");
    }
    /**
     * Gets the organizationId property value. The organizationId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrganizationId() {
        return this.backingStore.get("organizationId");
    }
    /**
     * Gets the owners property value. The owners of the group who can be users or service principals. Limited to 100 owners. Nullable. If this property isn&apos;t specified when creating a Microsoft 365 group the calling user (admin or non-admin) is automatically assigned as the group owner. A non-admin user can&apos;t explicitly add themselves to this collection when they&apos;re creating the group. For more information, see the related known issue. For security groups, the admin user isn&apos;t automatically added to this collection. For more information, see the related known issue. Supports $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1); Supports $expand including nested $select. For example, /groups?$filter=startsWith(displayName,&apos;Role&apos;)&amp;$select=id,displayName&amp;$expand=owners($select=id,userPrincipalName,displayName).
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getOwners() {
        return this.backingStore.get("owners");
    }
    /**
     * Gets the permissionGrants property value. The permissions granted for a group to a specific application. Supports $expand.
     * @return a {@link java.util.List<ResourceSpecificPermissionGrant>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ResourceSpecificPermissionGrant> getPermissionGrants() {
        return this.backingStore.get("permissionGrants");
    }
    /**
     * Gets the photo property value. The group&apos;s profile photo.
     * @return a {@link ProfilePhoto}
     */
    @jakarta.annotation.Nullable
    public ProfilePhoto getPhoto() {
        return this.backingStore.get("photo");
    }
    /**
     * Gets the photos property value. The profile photos owned by the group. Read-only. Nullable.
     * @return a {@link java.util.List<ProfilePhoto>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProfilePhoto> getPhotos() {
        return this.backingStore.get("photos");
    }
    /**
     * Gets the planner property value. Selective Planner services available to the group. Read-only. Nullable.
     * @return a {@link PlannerGroup}
     */
    @jakarta.annotation.Nullable
    public PlannerGroup getPlanner() {
        return this.backingStore.get("planner");
    }
    /**
     * Gets the preferredDataLocation property value. The preferred data location for the Microsoft 365 group. By default, the group inherits the group creator&apos;s preferred data location. To set this property, the calling app must be granted the Directory.ReadWrite.All permission and the user be assigned at least one of the following Microsoft Entra roles:  User Account Administrator Directory Writer  Exchange Administrator  SharePoint Administrator  For more information about this property, see OneDrive Online Multi-Geo and Create a Microsoft 365 group with a specific PDL. Nullable. Returned by default.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreferredDataLocation() {
        return this.backingStore.get("preferredDataLocation");
    }
    /**
     * Gets the preferredLanguage property value. The preferred language for a Microsoft 365 group. Should follow ISO 639-1 Code; for example, en-US. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreferredLanguage() {
        return this.backingStore.get("preferredLanguage");
    }
    /**
     * Gets the proxyAddresses property value. Email addresses for the group that direct to the same group mailbox. For example: [&apos;SMTP: bob@contoso.com&apos;, &apos;smtp: bob@sales.contoso.com&apos;]. The any operator is required for filter expressions on multi-valued properties. Returned by default. Read-only. Not nullable. Supports $filter (eq, not, ge, le, startsWith, endsWith, /$count eq 0, /$count ne 0).
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getProxyAddresses() {
        return this.backingStore.get("proxyAddresses");
    }
    /**
     * Gets the rejectedSenders property value. The list of users or groups not allowed to create posts or calendar events in this group. Nullable
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getRejectedSenders() {
        return this.backingStore.get("rejectedSenders");
    }
    /**
     * Gets the renewedDateTime property value. Timestamp of when the group was last renewed. This cannot be modified directly and is only updated via the renew service action. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Supports $filter (eq, ne, not, ge, le, in). Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRenewedDateTime() {
        return this.backingStore.get("renewedDateTime");
    }
    /**
     * Gets the resourceBehaviorOptions property value. Specifies the group behaviors that can be set for a Microsoft 365 group during creation. This property can be set only as part of creation (POST). For the list of possible values, see Microsoft 365 group behaviors and provisioning options.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getResourceBehaviorOptions() {
        return this.backingStore.get("resourceBehaviorOptions");
    }
    /**
     * Gets the resourceProvisioningOptions property value. Specifies the group resources that are associated with the Microsoft 365 group. The possible value is Team. For more information, see Microsoft 365 group behaviors and provisioning options. Returned by default. Supports $filter (eq, not, startsWith.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getResourceProvisioningOptions() {
        return this.backingStore.get("resourceProvisioningOptions");
    }
    /**
     * Gets the securityEnabled property value. Specifies whether the group is a security group. Required.Returned by default. Supports $filter (eq, ne, not, in).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityEnabled() {
        return this.backingStore.get("securityEnabled");
    }
    /**
     * Gets the securityIdentifier property value. Security identifier of the group, used in Windows scenarios. Read-only. Returned by default.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSecurityIdentifier() {
        return this.backingStore.get("securityIdentifier");
    }
    /**
     * Gets the serviceProvisioningErrors property value. Errors published by a federated service describing a non-transient, service-specific error regarding the properties or link from a group object.
     * @return a {@link java.util.List<ServiceProvisioningError>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceProvisioningError> getServiceProvisioningErrors() {
        return this.backingStore.get("serviceProvisioningErrors");
    }
    /**
     * Gets the settings property value. Settings that can govern this group&apos;s behavior, like whether members can invite guest users to the group. Nullable.
     * @return a {@link java.util.List<DirectorySetting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectorySetting> getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Gets the sites property value. The list of SharePoint sites in this group. Access the default site with /sites/root.
     * @return a {@link java.util.List<Site>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Site> getSites() {
        return this.backingStore.get("sites");
    }
    /**
     * Gets the team property value. The team associated with this group.
     * @return a {@link Team}
     */
    @jakarta.annotation.Nullable
    public Team getTeam() {
        return this.backingStore.get("team");
    }
    /**
     * Gets the theme property value. Specifies a Microsoft 365 group&apos;s color theme. Possible values are Teal, Purple, Green, Blue, Pink, Orange or Red. Returned by default.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTheme() {
        return this.backingStore.get("theme");
    }
    /**
     * Gets the threads property value. The group&apos;s conversation threads. Nullable.
     * @return a {@link java.util.List<ConversationThread>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConversationThread> getThreads() {
        return this.backingStore.get("threads");
    }
    /**
     * Gets the transitiveMemberOf property value. The groups a group is a member of, either directly or through nested membership. Nullable.
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getTransitiveMemberOf() {
        return this.backingStore.get("transitiveMemberOf");
    }
    /**
     * Gets the transitiveMembers property value. The direct and transitive members of a group. Nullable.
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getTransitiveMembers() {
        return this.backingStore.get("transitiveMembers");
    }
    /**
     * Gets the uniqueName property value. The unique identifier that can be assigned to a group and used as an alternate key. Immutable. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUniqueName() {
        return this.backingStore.get("uniqueName");
    }
    /**
     * Gets the unseenConversationsCount property value. Count of conversations delivered one or more new posts since the signed-in user&apos;s last visit to the group. This property is the same as unseenCount. Returned only on $select.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUnseenConversationsCount() {
        return this.backingStore.get("unseenConversationsCount");
    }
    /**
     * Gets the unseenCount property value. Count of conversations that have received new posts since the signed-in user last visited the group. This property is the same as unseenConversationsCount.Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUnseenCount() {
        return this.backingStore.get("unseenCount");
    }
    /**
     * Gets the unseenMessagesCount property value. Count of new posts that have been delivered to the group&apos;s conversations since the signed-in user&apos;s last visit to the group. Returned only on $select.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUnseenMessagesCount() {
        return this.backingStore.get("unseenMessagesCount");
    }
    /**
     * Gets the visibility property value. Specifies the group join policy and group content visibility for groups. Possible values are: Private, Public, or HiddenMembership. HiddenMembership can be set only for Microsoft 365 groups when the groups are created. It can&apos;t be updated later. Other values of visibility can be updated after group creation. If visibility value isn&apos;t specified during group creation on Microsoft Graph, a security group is created as Private by default, and Microsoft 365 group is Public. Groups assignable to roles are always Private. To learn more, see group visibility options. Returned by default. Nullable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVisibility() {
        return this.backingStore.get("visibility");
    }
    /**
     * Gets the writebackConfiguration property value. Specifies whether or not a group is configured to write back group object properties to on-premises Active Directory. These properties are used when group writeback is configured in the Microsoft Entra Connect sync client.
     * @return a {@link GroupWritebackConfiguration}
     */
    @jakarta.annotation.Nullable
    public GroupWritebackConfiguration getWritebackConfiguration() {
        return this.backingStore.get("writebackConfiguration");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("acceptedSenders", this.getAcceptedSenders());
        writer.writeEnumValue("accessType", this.getAccessType());
        writer.writeBooleanValue("allowExternalSenders", this.getAllowExternalSenders());
        writer.writeCollectionOfObjectValues("appRoleAssignments", this.getAppRoleAssignments());
        writer.writeCollectionOfObjectValues("assignedLabels", this.getAssignedLabels());
        writer.writeCollectionOfObjectValues("assignedLicenses", this.getAssignedLicenses());
        writer.writeBooleanValue("autoSubscribeNewMembers", this.getAutoSubscribeNewMembers());
        writer.writeObjectValue("calendar", this.getCalendar());
        writer.writeCollectionOfObjectValues("calendarView", this.getCalendarView());
        writer.writeStringValue("classification", this.getClassification());
        writer.writeObjectValue("cloudLicensing", this.getCloudLicensing());
        writer.writeCollectionOfObjectValues("conversations", this.getConversations());
        writer.writeStringValue("createdByAppId", this.getCreatedByAppId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("createdOnBehalfOf", this.getCreatedOnBehalfOf());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("drive", this.getDrive());
        writer.writeCollectionOfObjectValues("drives", this.getDrives());
        writer.writeCollectionOfObjectValues("endpoints", this.getEndpoints());
        writer.writeCollectionOfObjectValues("events", this.getEvents());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
        writer.writeCollectionOfObjectValues("groupLifecyclePolicies", this.getGroupLifecyclePolicies());
        writer.writeCollectionOfPrimitiveValues("groupTypes", this.getGroupTypes());
        writer.writeBooleanValue("hasMembersWithLicenseErrors", this.getHasMembersWithLicenseErrors());
        writer.writeBooleanValue("hideFromAddressLists", this.getHideFromAddressLists());
        writer.writeBooleanValue("hideFromOutlookClients", this.getHideFromOutlookClients());
        writer.writeCollectionOfPrimitiveValues("infoCatalogs", this.getInfoCatalogs());
        writer.writeBooleanValue("isArchived", this.getIsArchived());
        writer.writeBooleanValue("isAssignableToRole", this.getIsAssignableToRole());
        writer.writeBooleanValue("isFavorite", this.getIsFavorite());
        writer.writeBooleanValue("isManagementRestricted", this.getIsManagementRestricted());
        writer.writeBooleanValue("isSubscribedByMail", this.getIsSubscribedByMail());
        writer.writeObjectValue("licenseProcessingState", this.getLicenseProcessingState());
        writer.writeStringValue("mail", this.getMail());
        writer.writeBooleanValue("mailEnabled", this.getMailEnabled());
        writer.writeStringValue("mailNickname", this.getMailNickname());
        writer.writeCollectionOfObjectValues("memberOf", this.getMemberOf());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeStringValue("membershipRule", this.getMembershipRule());
        writer.writeStringValue("membershipRuleProcessingState", this.getMembershipRuleProcessingState());
        writer.writeObjectValue("membershipRuleProcessingStatus", this.getMembershipRuleProcessingStatus());
        writer.writeCollectionOfObjectValues("membersWithLicenseErrors", this.getMembersWithLicenseErrors());
        writer.writeObjectValue("onenote", this.getOnenote());
        writer.writeStringValue("onPremisesDomainName", this.getOnPremisesDomainName());
        writer.writeOffsetDateTimeValue("onPremisesLastSyncDateTime", this.getOnPremisesLastSyncDateTime());
        writer.writeStringValue("onPremisesNetBiosName", this.getOnPremisesNetBiosName());
        writer.writeCollectionOfObjectValues("onPremisesProvisioningErrors", this.getOnPremisesProvisioningErrors());
        writer.writeStringValue("onPremisesSamAccountName", this.getOnPremisesSamAccountName());
        writer.writeStringValue("onPremisesSecurityIdentifier", this.getOnPremisesSecurityIdentifier());
        writer.writeObjectValue("onPremisesSyncBehavior", this.getOnPremisesSyncBehavior());
        writer.writeBooleanValue("onPremisesSyncEnabled", this.getOnPremisesSyncEnabled());
        writer.writeStringValue("organizationId", this.getOrganizationId());
        writer.writeCollectionOfObjectValues("owners", this.getOwners());
        writer.writeCollectionOfObjectValues("permissionGrants", this.getPermissionGrants());
        writer.writeObjectValue("photo", this.getPhoto());
        writer.writeCollectionOfObjectValues("photos", this.getPhotos());
        writer.writeObjectValue("planner", this.getPlanner());
        writer.writeStringValue("preferredDataLocation", this.getPreferredDataLocation());
        writer.writeStringValue("preferredLanguage", this.getPreferredLanguage());
        writer.writeCollectionOfPrimitiveValues("proxyAddresses", this.getProxyAddresses());
        writer.writeCollectionOfObjectValues("rejectedSenders", this.getRejectedSenders());
        writer.writeOffsetDateTimeValue("renewedDateTime", this.getRenewedDateTime());
        writer.writeCollectionOfPrimitiveValues("resourceBehaviorOptions", this.getResourceBehaviorOptions());
        writer.writeCollectionOfPrimitiveValues("resourceProvisioningOptions", this.getResourceProvisioningOptions());
        writer.writeBooleanValue("securityEnabled", this.getSecurityEnabled());
        writer.writeStringValue("securityIdentifier", this.getSecurityIdentifier());
        writer.writeCollectionOfObjectValues("serviceProvisioningErrors", this.getServiceProvisioningErrors());
        writer.writeCollectionOfObjectValues("settings", this.getSettings());
        writer.writeCollectionOfObjectValues("sites", this.getSites());
        writer.writeObjectValue("team", this.getTeam());
        writer.writeStringValue("theme", this.getTheme());
        writer.writeCollectionOfObjectValues("threads", this.getThreads());
        writer.writeCollectionOfObjectValues("transitiveMemberOf", this.getTransitiveMemberOf());
        writer.writeCollectionOfObjectValues("transitiveMembers", this.getTransitiveMembers());
        writer.writeStringValue("uniqueName", this.getUniqueName());
        writer.writeIntegerValue("unseenConversationsCount", this.getUnseenConversationsCount());
        writer.writeIntegerValue("unseenCount", this.getUnseenCount());
        writer.writeIntegerValue("unseenMessagesCount", this.getUnseenMessagesCount());
        writer.writeStringValue("visibility", this.getVisibility());
        writer.writeObjectValue("writebackConfiguration", this.getWritebackConfiguration());
    }
    /**
     * Sets the acceptedSenders property value. The list of users or groups allowed to create posts or calendar events in this group. If this list is non-empty, then only users or groups listed here can post.
     * @param value Value to set for the acceptedSenders property.
     */
    public void setAcceptedSenders(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("acceptedSenders", value);
    }
    /**
     * Sets the accessType property value. Indicates the type of access to the group. Possible values are none, private, secret, and public.
     * @param value Value to set for the accessType property.
     */
    public void setAccessType(@jakarta.annotation.Nullable final GroupAccessType value) {
        this.backingStore.set("accessType", value);
    }
    /**
     * Sets the allowExternalSenders property value. Indicates if people external to the organization can send messages to the group. The default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @param value Value to set for the allowExternalSenders property.
     */
    public void setAllowExternalSenders(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowExternalSenders", value);
    }
    /**
     * Sets the appRoleAssignments property value. Represents the app roles a group has been granted for an application. Supports $expand.
     * @param value Value to set for the appRoleAssignments property.
     */
    public void setAppRoleAssignments(@jakarta.annotation.Nullable final java.util.List<AppRoleAssignment> value) {
        this.backingStore.set("appRoleAssignments", value);
    }
    /**
     * Sets the assignedLabels property value. The list of sensitivity label pairs (label ID, label name) associated with a Microsoft 365 group. Returned only on $select. This property can be updated only in delegated scenarios where the caller requires both the Microsoft Graph permission and a supported administrator role.
     * @param value Value to set for the assignedLabels property.
     */
    public void setAssignedLabels(@jakarta.annotation.Nullable final java.util.List<AssignedLabel> value) {
        this.backingStore.set("assignedLabels", value);
    }
    /**
     * Sets the assignedLicenses property value. The licenses that are assigned to the group. Returned only on $select. Supports $filter (eq). Read-only.
     * @param value Value to set for the assignedLicenses property.
     */
    public void setAssignedLicenses(@jakarta.annotation.Nullable final java.util.List<AssignedLicense> value) {
        this.backingStore.set("assignedLicenses", value);
    }
    /**
     * Sets the autoSubscribeNewMembers property value. Indicates if new members added to the group are auto-subscribed to receive email notifications. You can set this property in a PATCH request for the group; don&apos;t set it in the initial POST request that creates the group. Default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @param value Value to set for the autoSubscribeNewMembers property.
     */
    public void setAutoSubscribeNewMembers(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("autoSubscribeNewMembers", value);
    }
    /**
     * Sets the calendar property value. The group&apos;s calendar. Read-only.
     * @param value Value to set for the calendar property.
     */
    public void setCalendar(@jakarta.annotation.Nullable final Calendar value) {
        this.backingStore.set("calendar", value);
    }
    /**
     * Sets the calendarView property value. The calendar view for the calendar. Read-only.
     * @param value Value to set for the calendarView property.
     */
    public void setCalendarView(@jakarta.annotation.Nullable final java.util.List<Event> value) {
        this.backingStore.set("calendarView", value);
    }
    /**
     * Sets the classification property value. Describes a classification for the group (such as low, medium or high business impact). Valid values for this property are defined by creating a ClassificationList setting value, based on the template definition.Returned by default. Supports $filter (eq, ne, not, ge, le, startsWith).
     * @param value Value to set for the classification property.
     */
    public void setClassification(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("classification", value);
    }
    /**
     * Sets the cloudLicensing property value. The relationships of a group to cloud licensing resources.
     * @param value Value to set for the cloudLicensing property.
     */
    public void setCloudLicensing(@jakarta.annotation.Nullable final GroupCloudLicensing value) {
        this.backingStore.set("cloudLicensing", value);
    }
    /**
     * Sets the conversations property value. The group&apos;s conversations.
     * @param value Value to set for the conversations property.
     */
    public void setConversations(@jakarta.annotation.Nullable final java.util.List<Conversation> value) {
        this.backingStore.set("conversations", value);
    }
    /**
     * Sets the createdByAppId property value. App ID of the app used to create the group. Can be null for some groups. Returned by default. Read-only. Supports $filter (eq, ne, not, in, startsWith).
     * @param value Value to set for the createdByAppId property.
     */
    public void setCreatedByAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("createdByAppId", value);
    }
    /**
     * Sets the createdDateTime property value. Timestamp of when the group was created. The value can&apos;t be modified and is automatically populated when the group is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the createdOnBehalfOf property value. The user (or application) that created the group. Note: This isn&apos;t set if the user is an administrator. Read-only.
     * @param value Value to set for the createdOnBehalfOf property.
     */
    public void setCreatedOnBehalfOf(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.backingStore.set("createdOnBehalfOf", value);
    }
    /**
     * Sets the description property value. An optional description for the group. Returned by default. Supports $filter (eq, ne, not, ge, le, startsWith) and $search.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name for the group. Required. Maximum length is 256 characters. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the drive property value. The group&apos;s default drive. Read-only.
     * @param value Value to set for the drive property.
     */
    public void setDrive(@jakarta.annotation.Nullable final Drive value) {
        this.backingStore.set("drive", value);
    }
    /**
     * Sets the drives property value. The group&apos;s drives. Read-only.
     * @param value Value to set for the drives property.
     */
    public void setDrives(@jakarta.annotation.Nullable final java.util.List<Drive> value) {
        this.backingStore.set("drives", value);
    }
    /**
     * Sets the endpoints property value. Endpoints for the group. Read-only. Nullable.
     * @param value Value to set for the endpoints property.
     */
    public void setEndpoints(@jakarta.annotation.Nullable final java.util.List<Endpoint> value) {
        this.backingStore.set("endpoints", value);
    }
    /**
     * Sets the events property value. The group&apos;s events.
     * @param value Value to set for the events property.
     */
    public void setEvents(@jakarta.annotation.Nullable final java.util.List<Event> value) {
        this.backingStore.set("events", value);
    }
    /**
     * Sets the expirationDateTime property value. Timestamp of when the group is set to expire. It is null for security groups, but for Microsoft 365 groups, it represents when the group is set to expire as defined in the groupLifecyclePolicy. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Supports $filter (eq, ne, not, ge, le, in). Read-only.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the group. Read-only. Nullable.
     * @param value Value to set for the extensions property.
     */
    public void setExtensions(@jakarta.annotation.Nullable final java.util.List<Extension> value) {
        this.backingStore.set("extensions", value);
    }
    /**
     * Sets the groupLifecyclePolicies property value. The collection of lifecycle policies for this group. Read-only. Nullable.
     * @param value Value to set for the groupLifecyclePolicies property.
     */
    public void setGroupLifecyclePolicies(@jakarta.annotation.Nullable final java.util.List<GroupLifecyclePolicy> value) {
        this.backingStore.set("groupLifecyclePolicies", value);
    }
    /**
     * Sets the groupTypes property value. Specifies the group type and its membership. If the collection contains Unified, the group is a Microsoft 365 group; otherwise, it&apos;s either a security group or a distribution group. For details, see groups overview.If the collection includes DynamicMembership, the group has dynamic membership; otherwise, membership is static. Returned by default. Supports $filter (eq, not).
     * @param value Value to set for the groupTypes property.
     */
    public void setGroupTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("groupTypes", value);
    }
    /**
     * Sets the hasMembersWithLicenseErrors property value. Indicates whether there are members in this group that have license errors from its group-based license assignment. This property is never returned on a GET operation. You can use it as a $filter argument to get groups that have members with license errors (that is, filter for this property being true).  Supports $filter (eq).
     * @param value Value to set for the hasMembersWithLicenseErrors property.
     */
    public void setHasMembersWithLicenseErrors(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasMembersWithLicenseErrors", value);
    }
    /**
     * Sets the hideFromAddressLists property value. true if the group isn&apos;t displayed in certain parts of the Outlook user interface: in the Address Book, in address lists for selecting message recipients, and in the Browse Groups dialog for searching groups; false otherwise. The default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @param value Value to set for the hideFromAddressLists property.
     */
    public void setHideFromAddressLists(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hideFromAddressLists", value);
    }
    /**
     * Sets the hideFromOutlookClients property value. true if the group isn&apos;t displayed in Outlook clients, such as Outlook for Windows and Outlook on the web, false otherwise. The default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @param value Value to set for the hideFromOutlookClients property.
     */
    public void setHideFromOutlookClients(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hideFromOutlookClients", value);
    }
    /**
     * Sets the infoCatalogs property value. Identifies the info segments assigned to the group. Returned by default. Supports $filter (eq, not, ge, le, startsWith).
     * @param value Value to set for the infoCatalogs property.
     */
    public void setInfoCatalogs(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("infoCatalogs", value);
    }
    /**
     * Sets the isArchived property value. When a group is associated with a team, this property determines whether the team is in read-only mode. To read this property, use the /group/{groupId}/team endpoint or the Get team API. To update this property, use the archiveTeam and unarchiveTeam APIs.
     * @param value Value to set for the isArchived property.
     */
    public void setIsArchived(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isArchived", value);
    }
    /**
     * Sets the isAssignableToRole property value. Indicates whether this group can be assigned to a Microsoft Entra role. Optional. This property can only be set while creating the group and is immutable. If set to true, the securityEnabled property must also be set to true,  visibility must be Hidden, and the group cannot be a dynamic group (that is, groupTypes can&apos;t contain DynamicMembership). Only callers with at least the Privileged Role Administrator role can set this property. The caller must also be assigned the RoleManagement.ReadWrite.Directory permission to set this property or update the membership of such groups. For more, see Using a group to manage Microsoft Entra role assignmentsUsing this feature requires a Microsoft Entra ID P1 license. Returned by default. Supports $filter (eq, ne, not).
     * @param value Value to set for the isAssignableToRole property.
     */
    public void setIsAssignableToRole(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAssignableToRole", value);
    }
    /**
     * Sets the isFavorite property value. Indicates whether the user marked the group as favorite.
     * @param value Value to set for the isFavorite property.
     */
    public void setIsFavorite(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isFavorite", value);
    }
    /**
     * Sets the isManagementRestricted property value. Indicates whether the group is a member of a restricted management administrative unit. If not set, the default value is null and the default behavior is false. Read-only.  To manage a group member of a restricted management administrative unit, the administrator or calling app must be assigned a Microsoft Entra role at the scope of the restricted management administrative unit.
     * @param value Value to set for the isManagementRestricted property.
     */
    public void setIsManagementRestricted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isManagementRestricted", value);
    }
    /**
     * Sets the isSubscribedByMail property value. Indicates whether the signed-in user is subscribed to receive email conversations. The default value is true. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @param value Value to set for the isSubscribedByMail property.
     */
    public void setIsSubscribedByMail(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSubscribedByMail", value);
    }
    /**
     * Sets the licenseProcessingState property value. Indicates the status of the group license assignment to all group members. Possible values: QueuedForProcessing, ProcessingInProgress, and ProcessingComplete. Returned only on $select. Read-only.
     * @param value Value to set for the licenseProcessingState property.
     */
    public void setLicenseProcessingState(@jakarta.annotation.Nullable final LicenseProcessingState value) {
        this.backingStore.set("licenseProcessingState", value);
    }
    /**
     * Sets the mail property value. The SMTP address for the group, for example, &apos;serviceadmins@contoso.com&apos;. Returned by default. Read-only. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the mail property.
     */
    public void setMail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mail", value);
    }
    /**
     * Sets the mailEnabled property value. Specifies whether the group is mail-enabled. Required. Returned by default. Supports $filter (eq, ne, not, and eq on null values).
     * @param value Value to set for the mailEnabled property.
     */
    public void setMailEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("mailEnabled", value);
    }
    /**
     * Sets the mailNickname property value. The mail alias for the group, unique for Microsoft 365 groups in the organization. Maximum length is 64 characters. This property can contain only characters in the ASCII character set 0 - 127 except the following: @ () / [] &apos; ; : &lt;&gt; , SPACE. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith).
     * @param value Value to set for the mailNickname property.
     */
    public void setMailNickname(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mailNickname", value);
    }
    /**
     * Sets the memberOf property value. Groups and administrative units that this group is a member of. HTTP Methods: GET (supported for all groups). Read-only. Nullable. Supports $expand.
     * @param value Value to set for the memberOf property.
     */
    public void setMemberOf(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("memberOf", value);
    }
    /**
     * Sets the members property value. Direct group members, who can be users, devices, other groups, or service principals. Supports the List members, Add member, and Remove member operations. Nullable. Supports $expand including nested $select. For example, /groups?$filter=startsWith(displayName,&apos;Role&apos;)&amp;$select=id,displayName&amp;$expand=members($select=id,userPrincipalName,displayName).
     * @param value Value to set for the members property.
     */
    public void setMembers(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("members", value);
    }
    /**
     * Sets the membershipRule property value. The rule that determines members for this group if the group is a dynamic group (groupTypes contains DynamicMembership). For more information about the syntax of the membership rule, see Membership Rules syntax. Returned by default. Supports $filter (eq, ne, not, ge, le, startsWith).
     * @param value Value to set for the membershipRule property.
     */
    public void setMembershipRule(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("membershipRule", value);
    }
    /**
     * Sets the membershipRuleProcessingState property value. Indicates whether the dynamic membership processing is on or paused. Possible values are On or Paused. Returned by default. Supports $filter (eq, ne, not, in).
     * @param value Value to set for the membershipRuleProcessingState property.
     */
    public void setMembershipRuleProcessingState(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("membershipRuleProcessingState", value);
    }
    /**
     * Sets the membershipRuleProcessingStatus property value. Describes the processing status for rules-based dynamic groups. The property is null for non-rule-based dynamic groups or if the dynamic group processing has been paused. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}). Read-only.
     * @param value Value to set for the membershipRuleProcessingStatus property.
     */
    public void setMembershipRuleProcessingStatus(@jakarta.annotation.Nullable final MembershipRuleProcessingStatus value) {
        this.backingStore.set("membershipRuleProcessingStatus", value);
    }
    /**
     * Sets the membersWithLicenseErrors property value. A list of group members with license errors from this group-based license assignment. Read-only.
     * @param value Value to set for the membersWithLicenseErrors property.
     */
    public void setMembersWithLicenseErrors(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("membersWithLicenseErrors", value);
    }
    /**
     * Sets the onenote property value. The onenote property
     * @param value Value to set for the onenote property.
     */
    public void setOnenote(@jakarta.annotation.Nullable final Onenote value) {
        this.backingStore.set("onenote", value);
    }
    /**
     * Sets the onPremisesDomainName property value. Contains the on-premises domain FQDN, also called dnsDomainName synchronized from the on-premises directory. The property is only populated for customers synchronizing their on-premises directory to Microsoft Entra ID via Microsoft Entra Connect.Returned by default. Read-only.
     * @param value Value to set for the onPremisesDomainName property.
     */
    public void setOnPremisesDomainName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("onPremisesDomainName", value);
    }
    /**
     * Sets the onPremisesLastSyncDateTime property value. Indicates the last time at which the group was synced with the on-premises directory.The Timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Read-only. Supports $filter (eq, ne, not, ge, le, in).
     * @param value Value to set for the onPremisesLastSyncDateTime property.
     */
    public void setOnPremisesLastSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("onPremisesLastSyncDateTime", value);
    }
    /**
     * Sets the onPremisesNetBiosName property value. Contains the on-premises netBios name synchronized from the on-premises directory. The property is only populated for customers synchronizing their on-premises directory to Microsoft Entra ID via Microsoft Entra Connect.Returned by default. Read-only.
     * @param value Value to set for the onPremisesNetBiosName property.
     */
    public void setOnPremisesNetBiosName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("onPremisesNetBiosName", value);
    }
    /**
     * Sets the onPremisesProvisioningErrors property value. Errors when using Microsoft synchronization product during provisioning. Returned by default. Supports $filter (eq, not).
     * @param value Value to set for the onPremisesProvisioningErrors property.
     */
    public void setOnPremisesProvisioningErrors(@jakarta.annotation.Nullable final java.util.List<OnPremisesProvisioningError> value) {
        this.backingStore.set("onPremisesProvisioningErrors", value);
    }
    /**
     * Sets the onPremisesSamAccountName property value. Contains the on-premises SAM account name synchronized from the on-premises directory. The property is only populated for customers synchronizing their on-premises directory to Microsoft Entra ID via Microsoft Entra Connect.Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith). Read-only.
     * @param value Value to set for the onPremisesSamAccountName property.
     */
    public void setOnPremisesSamAccountName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("onPremisesSamAccountName", value);
    }
    /**
     * Sets the onPremisesSecurityIdentifier property value. Contains the on-premises security identifier (SID) for the group synchronized from on-premises to the cloud. Read-only. Returned by default. Supports $filter (eq including on null values).
     * @param value Value to set for the onPremisesSecurityIdentifier property.
     */
    public void setOnPremisesSecurityIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("onPremisesSecurityIdentifier", value);
    }
    /**
     * Sets the onPremisesSyncBehavior property value. Indicates the state of synchronization for a group between the cloud and on-premises Active Directory. Supports $filter only with advanced query capabilities. For example, $filter=onPremisesSyncBehavior/isCloudManaged eq true&amp;$count=true.
     * @param value Value to set for the onPremisesSyncBehavior property.
     */
    public void setOnPremisesSyncBehavior(@jakarta.annotation.Nullable final OnPremisesSyncBehavior value) {
        this.backingStore.set("onPremisesSyncBehavior", value);
    }
    /**
     * Sets the onPremisesSyncEnabled property value. true if this group is synced from an on-premises directory; false if this group was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default). Returned by default. Read-only. Supports $filter (eq, ne, not, in, and eq on null values).
     * @param value Value to set for the onPremisesSyncEnabled property.
     */
    public void setOnPremisesSyncEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("onPremisesSyncEnabled", value);
    }
    /**
     * Sets the organizationId property value. The organizationId property
     * @param value Value to set for the organizationId property.
     */
    public void setOrganizationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("organizationId", value);
    }
    /**
     * Sets the owners property value. The owners of the group who can be users or service principals. Limited to 100 owners. Nullable. If this property isn&apos;t specified when creating a Microsoft 365 group the calling user (admin or non-admin) is automatically assigned as the group owner. A non-admin user can&apos;t explicitly add themselves to this collection when they&apos;re creating the group. For more information, see the related known issue. For security groups, the admin user isn&apos;t automatically added to this collection. For more information, see the related known issue. Supports $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1); Supports $expand including nested $select. For example, /groups?$filter=startsWith(displayName,&apos;Role&apos;)&amp;$select=id,displayName&amp;$expand=owners($select=id,userPrincipalName,displayName).
     * @param value Value to set for the owners property.
     */
    public void setOwners(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("owners", value);
    }
    /**
     * Sets the permissionGrants property value. The permissions granted for a group to a specific application. Supports $expand.
     * @param value Value to set for the permissionGrants property.
     */
    public void setPermissionGrants(@jakarta.annotation.Nullable final java.util.List<ResourceSpecificPermissionGrant> value) {
        this.backingStore.set("permissionGrants", value);
    }
    /**
     * Sets the photo property value. The group&apos;s profile photo.
     * @param value Value to set for the photo property.
     */
    public void setPhoto(@jakarta.annotation.Nullable final ProfilePhoto value) {
        this.backingStore.set("photo", value);
    }
    /**
     * Sets the photos property value. The profile photos owned by the group. Read-only. Nullable.
     * @param value Value to set for the photos property.
     */
    public void setPhotos(@jakarta.annotation.Nullable final java.util.List<ProfilePhoto> value) {
        this.backingStore.set("photos", value);
    }
    /**
     * Sets the planner property value. Selective Planner services available to the group. Read-only. Nullable.
     * @param value Value to set for the planner property.
     */
    public void setPlanner(@jakarta.annotation.Nullable final PlannerGroup value) {
        this.backingStore.set("planner", value);
    }
    /**
     * Sets the preferredDataLocation property value. The preferred data location for the Microsoft 365 group. By default, the group inherits the group creator&apos;s preferred data location. To set this property, the calling app must be granted the Directory.ReadWrite.All permission and the user be assigned at least one of the following Microsoft Entra roles:  User Account Administrator Directory Writer  Exchange Administrator  SharePoint Administrator  For more information about this property, see OneDrive Online Multi-Geo and Create a Microsoft 365 group with a specific PDL. Nullable. Returned by default.
     * @param value Value to set for the preferredDataLocation property.
     */
    public void setPreferredDataLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("preferredDataLocation", value);
    }
    /**
     * Sets the preferredLanguage property value. The preferred language for a Microsoft 365 group. Should follow ISO 639-1 Code; for example, en-US. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the preferredLanguage property.
     */
    public void setPreferredLanguage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("preferredLanguage", value);
    }
    /**
     * Sets the proxyAddresses property value. Email addresses for the group that direct to the same group mailbox. For example: [&apos;SMTP: bob@contoso.com&apos;, &apos;smtp: bob@sales.contoso.com&apos;]. The any operator is required for filter expressions on multi-valued properties. Returned by default. Read-only. Not nullable. Supports $filter (eq, not, ge, le, startsWith, endsWith, /$count eq 0, /$count ne 0).
     * @param value Value to set for the proxyAddresses property.
     */
    public void setProxyAddresses(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("proxyAddresses", value);
    }
    /**
     * Sets the rejectedSenders property value. The list of users or groups not allowed to create posts or calendar events in this group. Nullable
     * @param value Value to set for the rejectedSenders property.
     */
    public void setRejectedSenders(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("rejectedSenders", value);
    }
    /**
     * Sets the renewedDateTime property value. Timestamp of when the group was last renewed. This cannot be modified directly and is only updated via the renew service action. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Supports $filter (eq, ne, not, ge, le, in). Read-only.
     * @param value Value to set for the renewedDateTime property.
     */
    public void setRenewedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("renewedDateTime", value);
    }
    /**
     * Sets the resourceBehaviorOptions property value. Specifies the group behaviors that can be set for a Microsoft 365 group during creation. This property can be set only as part of creation (POST). For the list of possible values, see Microsoft 365 group behaviors and provisioning options.
     * @param value Value to set for the resourceBehaviorOptions property.
     */
    public void setResourceBehaviorOptions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("resourceBehaviorOptions", value);
    }
    /**
     * Sets the resourceProvisioningOptions property value. Specifies the group resources that are associated with the Microsoft 365 group. The possible value is Team. For more information, see Microsoft 365 group behaviors and provisioning options. Returned by default. Supports $filter (eq, not, startsWith.
     * @param value Value to set for the resourceProvisioningOptions property.
     */
    public void setResourceProvisioningOptions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("resourceProvisioningOptions", value);
    }
    /**
     * Sets the securityEnabled property value. Specifies whether the group is a security group. Required.Returned by default. Supports $filter (eq, ne, not, in).
     * @param value Value to set for the securityEnabled property.
     */
    public void setSecurityEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("securityEnabled", value);
    }
    /**
     * Sets the securityIdentifier property value. Security identifier of the group, used in Windows scenarios. Read-only. Returned by default.
     * @param value Value to set for the securityIdentifier property.
     */
    public void setSecurityIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("securityIdentifier", value);
    }
    /**
     * Sets the serviceProvisioningErrors property value. Errors published by a federated service describing a non-transient, service-specific error regarding the properties or link from a group object.
     * @param value Value to set for the serviceProvisioningErrors property.
     */
    public void setServiceProvisioningErrors(@jakarta.annotation.Nullable final java.util.List<ServiceProvisioningError> value) {
        this.backingStore.set("serviceProvisioningErrors", value);
    }
    /**
     * Sets the settings property value. Settings that can govern this group&apos;s behavior, like whether members can invite guest users to the group. Nullable.
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final java.util.List<DirectorySetting> value) {
        this.backingStore.set("settings", value);
    }
    /**
     * Sets the sites property value. The list of SharePoint sites in this group. Access the default site with /sites/root.
     * @param value Value to set for the sites property.
     */
    public void setSites(@jakarta.annotation.Nullable final java.util.List<Site> value) {
        this.backingStore.set("sites", value);
    }
    /**
     * Sets the team property value. The team associated with this group.
     * @param value Value to set for the team property.
     */
    public void setTeam(@jakarta.annotation.Nullable final Team value) {
        this.backingStore.set("team", value);
    }
    /**
     * Sets the theme property value. Specifies a Microsoft 365 group&apos;s color theme. Possible values are Teal, Purple, Green, Blue, Pink, Orange or Red. Returned by default.
     * @param value Value to set for the theme property.
     */
    public void setTheme(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("theme", value);
    }
    /**
     * Sets the threads property value. The group&apos;s conversation threads. Nullable.
     * @param value Value to set for the threads property.
     */
    public void setThreads(@jakarta.annotation.Nullable final java.util.List<ConversationThread> value) {
        this.backingStore.set("threads", value);
    }
    /**
     * Sets the transitiveMemberOf property value. The groups a group is a member of, either directly or through nested membership. Nullable.
     * @param value Value to set for the transitiveMemberOf property.
     */
    public void setTransitiveMemberOf(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("transitiveMemberOf", value);
    }
    /**
     * Sets the transitiveMembers property value. The direct and transitive members of a group. Nullable.
     * @param value Value to set for the transitiveMembers property.
     */
    public void setTransitiveMembers(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("transitiveMembers", value);
    }
    /**
     * Sets the uniqueName property value. The unique identifier that can be assigned to a group and used as an alternate key. Immutable. Read-only.
     * @param value Value to set for the uniqueName property.
     */
    public void setUniqueName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("uniqueName", value);
    }
    /**
     * Sets the unseenConversationsCount property value. Count of conversations delivered one or more new posts since the signed-in user&apos;s last visit to the group. This property is the same as unseenCount. Returned only on $select.
     * @param value Value to set for the unseenConversationsCount property.
     */
    public void setUnseenConversationsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("unseenConversationsCount", value);
    }
    /**
     * Sets the unseenCount property value. Count of conversations that have received new posts since the signed-in user last visited the group. This property is the same as unseenConversationsCount.Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @param value Value to set for the unseenCount property.
     */
    public void setUnseenCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("unseenCount", value);
    }
    /**
     * Sets the unseenMessagesCount property value. Count of new posts that have been delivered to the group&apos;s conversations since the signed-in user&apos;s last visit to the group. Returned only on $select.
     * @param value Value to set for the unseenMessagesCount property.
     */
    public void setUnseenMessagesCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("unseenMessagesCount", value);
    }
    /**
     * Sets the visibility property value. Specifies the group join policy and group content visibility for groups. Possible values are: Private, Public, or HiddenMembership. HiddenMembership can be set only for Microsoft 365 groups when the groups are created. It can&apos;t be updated later. Other values of visibility can be updated after group creation. If visibility value isn&apos;t specified during group creation on Microsoft Graph, a security group is created as Private by default, and Microsoft 365 group is Public. Groups assignable to roles are always Private. To learn more, see group visibility options. Returned by default. Nullable.
     * @param value Value to set for the visibility property.
     */
    public void setVisibility(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("visibility", value);
    }
    /**
     * Sets the writebackConfiguration property value. Specifies whether or not a group is configured to write back group object properties to on-premises Active Directory. These properties are used when group writeback is configured in the Microsoft Entra Connect sync client.
     * @param value Value to set for the writebackConfiguration property.
     */
    public void setWritebackConfiguration(@jakarta.annotation.Nullable final GroupWritebackConfiguration value) {
        this.backingStore.set("writebackConfiguration", value);
    }
}
