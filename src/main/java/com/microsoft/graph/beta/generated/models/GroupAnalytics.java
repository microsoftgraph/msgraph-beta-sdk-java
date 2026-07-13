package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupAnalytics extends Entity implements Parsable {
    /**
     * Instantiates a new {@link GroupAnalytics} and sets the default values.
     */
    public GroupAnalytics() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GroupAnalytics}
     */
    @jakarta.annotation.Nonnull
    public static GroupAnalytics createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupAnalytics();
    }
    /**
     * Gets the assignedRoleCount property value. The number of directory roles assigned to the group. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getAssignedRoleCount() {
        return this.backingStore.get("assignedRoleCount");
    }
    /**
     * Gets the calculatedDateTime property value. The date and time when the analytics for the group were last calculated. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCalculatedDateTime() {
        return this.backingStore.get("calculatedDateTime");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the group was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the directGroupMemberCount property value. The number of direct members of the group that are themselves groups. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getDirectGroupMemberCount() {
        return this.backingStore.get("directGroupMemberCount");
    }
    /**
     * Gets the displayName property value. The display name of the group. Supports $filter (eq, ne, startsWith, endsWith, contains) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the dynamicMembershipType property value. The dynamic membership classification of the group, derived from its membership rule. Supports $filter (eq, ne, startsWith, endsWith, contains) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDynamicMembershipType() {
        return this.backingStore.get("dynamicMembershipType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedRoleCount", (n) -> { this.setAssignedRoleCount(n.getLongValue()); });
        deserializerMap.put("calculatedDateTime", (n) -> { this.setCalculatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("directGroupMemberCount", (n) -> { this.setDirectGroupMemberCount(n.getLongValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("dynamicMembershipType", (n) -> { this.setDynamicMembershipType(n.getStringValue()); });
        deserializerMap.put("groupExpirationDateTime", (n) -> { this.setGroupExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("groupType", (n) -> { this.setGroupType(n.getEnumValue(GroupTypeEnum::forValue)); });
        deserializerMap.put("guestOwnerCount", (n) -> { this.setGuestOwnerCount(n.getLongValue()); });
        deserializerMap.put("guestTransitiveUserCount", (n) -> { this.setGuestTransitiveUserCount(n.getLongValue()); });
        deserializerMap.put("isCloudDistributionListGroup", (n) -> { this.setIsCloudDistributionListGroup(n.getBooleanValue()); });
        deserializerMap.put("isCloudM365Group", (n) -> { this.setIsCloudM365Group(n.getBooleanValue()); });
        deserializerMap.put("isCloudMailEnabledSecurityGroup", (n) -> { this.setIsCloudMailEnabledSecurityGroup(n.getBooleanValue()); });
        deserializerMap.put("isCloudSecurityGroup", (n) -> { this.setIsCloudSecurityGroup(n.getBooleanValue()); });
        deserializerMap.put("isDynamicGroup", (n) -> { this.setIsDynamicGroup(n.getBooleanValue()); });
        deserializerMap.put("isOnPremiseDistributionListGroup", (n) -> { this.setIsOnPremiseDistributionListGroup(n.getBooleanValue()); });
        deserializerMap.put("isOnPremiseMailEnabledSecurityGroup", (n) -> { this.setIsOnPremiseMailEnabledSecurityGroup(n.getBooleanValue()); });
        deserializerMap.put("isOnPremiseSecurityGroup", (n) -> { this.setIsOnPremiseSecurityGroup(n.getBooleanValue()); });
        deserializerMap.put("isValidGroup", (n) -> { this.setIsValidGroup(n.getBooleanValue()); });
        deserializerMap.put("lastRestorationDateTime", (n) -> { this.setLastRestorationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("memberOwnerCount", (n) -> { this.setMemberOwnerCount(n.getLongValue()); });
        deserializerMap.put("membershipRuleContainsCount", (n) -> { this.setMembershipRuleContainsCount(n.getLongValue()); });
        deserializerMap.put("membershipRuleExpressionCount", (n) -> { this.setMembershipRuleExpressionCount(n.getLongValue()); });
        deserializerMap.put("membershipRuleMatchCount", (n) -> { this.setMembershipRuleMatchCount(n.getLongValue()); });
        deserializerMap.put("membershipRuleMemberOfCount", (n) -> { this.setMembershipRuleMemberOfCount(n.getLongValue()); });
        deserializerMap.put("membershipRuleProcessingState", (n) -> { this.setMembershipRuleProcessingState(n.getStringValue()); });
        deserializerMap.put("memberTransitiveUserCount", (n) -> { this.setMemberTransitiveUserCount(n.getLongValue()); });
        deserializerMap.put("preferredDataLocation", (n) -> { this.setPreferredDataLocation(n.getStringValue()); });
        deserializerMap.put("sensitivityLabelCount", (n) -> { this.setSensitivityLabelCount(n.getLongValue()); });
        deserializerMap.put("servicePrincipalOwnerCount", (n) -> { this.setServicePrincipalOwnerCount(n.getLongValue()); });
        deserializerMap.put("softDeletionDateTime", (n) -> { this.setSoftDeletionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("transitiveServicePrincipalCount", (n) -> { this.setTransitiveServicePrincipalCount(n.getLongValue()); });
        deserializerMap.put("transitiveUserCount", (n) -> { this.setTransitiveUserCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupExpirationDateTime property value. The date and time when the group expires. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getGroupExpirationDateTime() {
        return this.backingStore.get("groupExpirationDateTime");
    }
    /**
     * Gets the groupType property value. The groupType property
     * @return a {@link GroupTypeEnum}
     */
    @jakarta.annotation.Nullable
    public GroupTypeEnum getGroupType() {
        return this.backingStore.get("groupType");
    }
    /**
     * Gets the guestOwnerCount property value. The number of owners of the group that are guest users. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getGuestOwnerCount() {
        return this.backingStore.get("guestOwnerCount");
    }
    /**
     * Gets the guestTransitiveUserCount property value. The number of transitive user members of the group that are guest users. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getGuestTransitiveUserCount() {
        return this.backingStore.get("guestTransitiveUserCount");
    }
    /**
     * Gets the isCloudDistributionListGroup property value. Indicates whether the group is a non-soft-deleted cloud distribution list group. Supports $filter (eq, ne) and $orderby.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCloudDistributionListGroup() {
        return this.backingStore.get("isCloudDistributionListGroup");
    }
    /**
     * Gets the isCloudM365Group property value. Indicates whether the group is a non-soft-deleted cloud Microsoft 365 group. Supports $filter (eq, ne) and $orderby.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCloudM365Group() {
        return this.backingStore.get("isCloudM365Group");
    }
    /**
     * Gets the isCloudMailEnabledSecurityGroup property value. Indicates whether the group is a non-soft-deleted cloud mail-enabled security group. Supports $filter (eq, ne) and $orderby.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCloudMailEnabledSecurityGroup() {
        return this.backingStore.get("isCloudMailEnabledSecurityGroup");
    }
    /**
     * Gets the isCloudSecurityGroup property value. Indicates whether the group is a non-soft-deleted cloud security group. Supports $filter (eq, ne) and $orderby.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCloudSecurityGroup() {
        return this.backingStore.get("isCloudSecurityGroup");
    }
    /**
     * Gets the isDynamicGroup property value. Indicates whether the group is a dynamic group. Supports $filter (eq, ne) and $orderby.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDynamicGroup() {
        return this.backingStore.get("isDynamicGroup");
    }
    /**
     * Gets the isOnPremiseDistributionListGroup property value. Indicates whether the group is a non-soft-deleted on-premises distribution list group. Supports $filter (eq, ne) and $orderby.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOnPremiseDistributionListGroup() {
        return this.backingStore.get("isOnPremiseDistributionListGroup");
    }
    /**
     * Gets the isOnPremiseMailEnabledSecurityGroup property value. Indicates whether the group is a non-soft-deleted on-premises mail-enabled security group. Supports $filter (eq, ne) and $orderby.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOnPremiseMailEnabledSecurityGroup() {
        return this.backingStore.get("isOnPremiseMailEnabledSecurityGroup");
    }
    /**
     * Gets the isOnPremiseSecurityGroup property value. Indicates whether the group is a non-soft-deleted on-premises security group. Supports $filter (eq, ne) and $orderby.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOnPremiseSecurityGroup() {
        return this.backingStore.get("isOnPremiseSecurityGroup");
    }
    /**
     * Gets the isValidGroup property value. Indicates whether the group is a valid (non-soft-deleted) group. Supports $filter (eq, ne) and $orderby.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsValidGroup() {
        return this.backingStore.get("isValidGroup");
    }
    /**
     * Gets the lastRestorationDateTime property value. The date and time when the group was last restored from a soft-deleted state. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastRestorationDateTime() {
        return this.backingStore.get("lastRestorationDateTime");
    }
    /**
     * Gets the memberOwnerCount property value. The number of owners of the group that are member (non-guest) users. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMemberOwnerCount() {
        return this.backingStore.get("memberOwnerCount");
    }
    /**
     * Gets the membershipRuleContainsCount property value. The number of contains expressions in the membership rule of the group. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMembershipRuleContainsCount() {
        return this.backingStore.get("membershipRuleContainsCount");
    }
    /**
     * Gets the membershipRuleExpressionCount property value. The number of expressions in the membership rule of the group. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMembershipRuleExpressionCount() {
        return this.backingStore.get("membershipRuleExpressionCount");
    }
    /**
     * Gets the membershipRuleMatchCount property value. The number of match expressions in the membership rule of the group. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMembershipRuleMatchCount() {
        return this.backingStore.get("membershipRuleMatchCount");
    }
    /**
     * Gets the membershipRuleMemberOfCount property value. The number of memberOf expressions in the membership rule of the group. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMembershipRuleMemberOfCount() {
        return this.backingStore.get("membershipRuleMemberOfCount");
    }
    /**
     * Gets the membershipRuleProcessingState property value. The processing state of the membership rule of the group. Supports $filter (eq, ne, startsWith, endsWith, contains) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMembershipRuleProcessingState() {
        return this.backingStore.get("membershipRuleProcessingState");
    }
    /**
     * Gets the memberTransitiveUserCount property value. The number of transitive user members of the group that are member (non-guest) users. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMemberTransitiveUserCount() {
        return this.backingStore.get("memberTransitiveUserCount");
    }
    /**
     * Gets the preferredDataLocation property value. The preferred data location of the group. Supports $filter (eq, ne, startsWith, endsWith, contains) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreferredDataLocation() {
        return this.backingStore.get("preferredDataLocation");
    }
    /**
     * Gets the sensitivityLabelCount property value. The number of sensitivity labels applied to the group. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSensitivityLabelCount() {
        return this.backingStore.get("sensitivityLabelCount");
    }
    /**
     * Gets the servicePrincipalOwnerCount property value. The number of owners of the group that are service principals. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getServicePrincipalOwnerCount() {
        return this.backingStore.get("servicePrincipalOwnerCount");
    }
    /**
     * Gets the softDeletionDateTime property value. The date and time when the group was soft-deleted. If this property is empty, the group isn&apos;t soft-deleted. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSoftDeletionDateTime() {
        return this.backingStore.get("softDeletionDateTime");
    }
    /**
     * Gets the tenantId property value. The unique identifier of the tenant that the group belongs to. Supports $filter (eq, ne) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Gets the transitiveServicePrincipalCount property value. The number of transitive members of the group that are service principals. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTransitiveServicePrincipalCount() {
        return this.backingStore.get("transitiveServicePrincipalCount");
    }
    /**
     * Gets the transitiveUserCount property value. The total number of transitive user members of the group. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTransitiveUserCount() {
        return this.backingStore.get("transitiveUserCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("assignedRoleCount", this.getAssignedRoleCount());
        writer.writeOffsetDateTimeValue("calculatedDateTime", this.getCalculatedDateTime());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeLongValue("directGroupMemberCount", this.getDirectGroupMemberCount());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("dynamicMembershipType", this.getDynamicMembershipType());
        writer.writeOffsetDateTimeValue("groupExpirationDateTime", this.getGroupExpirationDateTime());
        writer.writeEnumValue("groupType", this.getGroupType());
        writer.writeLongValue("guestOwnerCount", this.getGuestOwnerCount());
        writer.writeLongValue("guestTransitiveUserCount", this.getGuestTransitiveUserCount());
        writer.writeBooleanValue("isCloudDistributionListGroup", this.getIsCloudDistributionListGroup());
        writer.writeBooleanValue("isCloudM365Group", this.getIsCloudM365Group());
        writer.writeBooleanValue("isCloudMailEnabledSecurityGroup", this.getIsCloudMailEnabledSecurityGroup());
        writer.writeBooleanValue("isCloudSecurityGroup", this.getIsCloudSecurityGroup());
        writer.writeBooleanValue("isDynamicGroup", this.getIsDynamicGroup());
        writer.writeBooleanValue("isOnPremiseDistributionListGroup", this.getIsOnPremiseDistributionListGroup());
        writer.writeBooleanValue("isOnPremiseMailEnabledSecurityGroup", this.getIsOnPremiseMailEnabledSecurityGroup());
        writer.writeBooleanValue("isOnPremiseSecurityGroup", this.getIsOnPremiseSecurityGroup());
        writer.writeBooleanValue("isValidGroup", this.getIsValidGroup());
        writer.writeOffsetDateTimeValue("lastRestorationDateTime", this.getLastRestorationDateTime());
        writer.writeLongValue("memberOwnerCount", this.getMemberOwnerCount());
        writer.writeLongValue("membershipRuleContainsCount", this.getMembershipRuleContainsCount());
        writer.writeLongValue("membershipRuleExpressionCount", this.getMembershipRuleExpressionCount());
        writer.writeLongValue("membershipRuleMatchCount", this.getMembershipRuleMatchCount());
        writer.writeLongValue("membershipRuleMemberOfCount", this.getMembershipRuleMemberOfCount());
        writer.writeStringValue("membershipRuleProcessingState", this.getMembershipRuleProcessingState());
        writer.writeLongValue("memberTransitiveUserCount", this.getMemberTransitiveUserCount());
        writer.writeStringValue("preferredDataLocation", this.getPreferredDataLocation());
        writer.writeLongValue("sensitivityLabelCount", this.getSensitivityLabelCount());
        writer.writeLongValue("servicePrincipalOwnerCount", this.getServicePrincipalOwnerCount());
        writer.writeOffsetDateTimeValue("softDeletionDateTime", this.getSoftDeletionDateTime());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeLongValue("transitiveServicePrincipalCount", this.getTransitiveServicePrincipalCount());
        writer.writeLongValue("transitiveUserCount", this.getTransitiveUserCount());
    }
    /**
     * Sets the assignedRoleCount property value. The number of directory roles assigned to the group. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @param value Value to set for the assignedRoleCount property.
     */
    public void setAssignedRoleCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("assignedRoleCount", value);
    }
    /**
     * Sets the calculatedDateTime property value. The date and time when the analytics for the group were last calculated. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @param value Value to set for the calculatedDateTime property.
     */
    public void setCalculatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("calculatedDateTime", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the group was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the directGroupMemberCount property value. The number of direct members of the group that are themselves groups. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @param value Value to set for the directGroupMemberCount property.
     */
    public void setDirectGroupMemberCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("directGroupMemberCount", value);
    }
    /**
     * Sets the displayName property value. The display name of the group. Supports $filter (eq, ne, startsWith, endsWith, contains) and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the dynamicMembershipType property value. The dynamic membership classification of the group, derived from its membership rule. Supports $filter (eq, ne, startsWith, endsWith, contains) and $orderby.
     * @param value Value to set for the dynamicMembershipType property.
     */
    public void setDynamicMembershipType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("dynamicMembershipType", value);
    }
    /**
     * Sets the groupExpirationDateTime property value. The date and time when the group expires. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @param value Value to set for the groupExpirationDateTime property.
     */
    public void setGroupExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("groupExpirationDateTime", value);
    }
    /**
     * Sets the groupType property value. The groupType property
     * @param value Value to set for the groupType property.
     */
    public void setGroupType(@jakarta.annotation.Nullable final GroupTypeEnum value) {
        this.backingStore.set("groupType", value);
    }
    /**
     * Sets the guestOwnerCount property value. The number of owners of the group that are guest users. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @param value Value to set for the guestOwnerCount property.
     */
    public void setGuestOwnerCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("guestOwnerCount", value);
    }
    /**
     * Sets the guestTransitiveUserCount property value. The number of transitive user members of the group that are guest users. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @param value Value to set for the guestTransitiveUserCount property.
     */
    public void setGuestTransitiveUserCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("guestTransitiveUserCount", value);
    }
    /**
     * Sets the isCloudDistributionListGroup property value. Indicates whether the group is a non-soft-deleted cloud distribution list group. Supports $filter (eq, ne) and $orderby.
     * @param value Value to set for the isCloudDistributionListGroup property.
     */
    public void setIsCloudDistributionListGroup(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCloudDistributionListGroup", value);
    }
    /**
     * Sets the isCloudM365Group property value. Indicates whether the group is a non-soft-deleted cloud Microsoft 365 group. Supports $filter (eq, ne) and $orderby.
     * @param value Value to set for the isCloudM365Group property.
     */
    public void setIsCloudM365Group(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCloudM365Group", value);
    }
    /**
     * Sets the isCloudMailEnabledSecurityGroup property value. Indicates whether the group is a non-soft-deleted cloud mail-enabled security group. Supports $filter (eq, ne) and $orderby.
     * @param value Value to set for the isCloudMailEnabledSecurityGroup property.
     */
    public void setIsCloudMailEnabledSecurityGroup(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCloudMailEnabledSecurityGroup", value);
    }
    /**
     * Sets the isCloudSecurityGroup property value. Indicates whether the group is a non-soft-deleted cloud security group. Supports $filter (eq, ne) and $orderby.
     * @param value Value to set for the isCloudSecurityGroup property.
     */
    public void setIsCloudSecurityGroup(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCloudSecurityGroup", value);
    }
    /**
     * Sets the isDynamicGroup property value. Indicates whether the group is a dynamic group. Supports $filter (eq, ne) and $orderby.
     * @param value Value to set for the isDynamicGroup property.
     */
    public void setIsDynamicGroup(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDynamicGroup", value);
    }
    /**
     * Sets the isOnPremiseDistributionListGroup property value. Indicates whether the group is a non-soft-deleted on-premises distribution list group. Supports $filter (eq, ne) and $orderby.
     * @param value Value to set for the isOnPremiseDistributionListGroup property.
     */
    public void setIsOnPremiseDistributionListGroup(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isOnPremiseDistributionListGroup", value);
    }
    /**
     * Sets the isOnPremiseMailEnabledSecurityGroup property value. Indicates whether the group is a non-soft-deleted on-premises mail-enabled security group. Supports $filter (eq, ne) and $orderby.
     * @param value Value to set for the isOnPremiseMailEnabledSecurityGroup property.
     */
    public void setIsOnPremiseMailEnabledSecurityGroup(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isOnPremiseMailEnabledSecurityGroup", value);
    }
    /**
     * Sets the isOnPremiseSecurityGroup property value. Indicates whether the group is a non-soft-deleted on-premises security group. Supports $filter (eq, ne) and $orderby.
     * @param value Value to set for the isOnPremiseSecurityGroup property.
     */
    public void setIsOnPremiseSecurityGroup(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isOnPremiseSecurityGroup", value);
    }
    /**
     * Sets the isValidGroup property value. Indicates whether the group is a valid (non-soft-deleted) group. Supports $filter (eq, ne) and $orderby.
     * @param value Value to set for the isValidGroup property.
     */
    public void setIsValidGroup(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isValidGroup", value);
    }
    /**
     * Sets the lastRestorationDateTime property value. The date and time when the group was last restored from a soft-deleted state. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @param value Value to set for the lastRestorationDateTime property.
     */
    public void setLastRestorationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastRestorationDateTime", value);
    }
    /**
     * Sets the memberOwnerCount property value. The number of owners of the group that are member (non-guest) users. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @param value Value to set for the memberOwnerCount property.
     */
    public void setMemberOwnerCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("memberOwnerCount", value);
    }
    /**
     * Sets the membershipRuleContainsCount property value. The number of contains expressions in the membership rule of the group. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @param value Value to set for the membershipRuleContainsCount property.
     */
    public void setMembershipRuleContainsCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("membershipRuleContainsCount", value);
    }
    /**
     * Sets the membershipRuleExpressionCount property value. The number of expressions in the membership rule of the group. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @param value Value to set for the membershipRuleExpressionCount property.
     */
    public void setMembershipRuleExpressionCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("membershipRuleExpressionCount", value);
    }
    /**
     * Sets the membershipRuleMatchCount property value. The number of match expressions in the membership rule of the group. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @param value Value to set for the membershipRuleMatchCount property.
     */
    public void setMembershipRuleMatchCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("membershipRuleMatchCount", value);
    }
    /**
     * Sets the membershipRuleMemberOfCount property value. The number of memberOf expressions in the membership rule of the group. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @param value Value to set for the membershipRuleMemberOfCount property.
     */
    public void setMembershipRuleMemberOfCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("membershipRuleMemberOfCount", value);
    }
    /**
     * Sets the membershipRuleProcessingState property value. The processing state of the membership rule of the group. Supports $filter (eq, ne, startsWith, endsWith, contains) and $orderby.
     * @param value Value to set for the membershipRuleProcessingState property.
     */
    public void setMembershipRuleProcessingState(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("membershipRuleProcessingState", value);
    }
    /**
     * Sets the memberTransitiveUserCount property value. The number of transitive user members of the group that are member (non-guest) users. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @param value Value to set for the memberTransitiveUserCount property.
     */
    public void setMemberTransitiveUserCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("memberTransitiveUserCount", value);
    }
    /**
     * Sets the preferredDataLocation property value. The preferred data location of the group. Supports $filter (eq, ne, startsWith, endsWith, contains) and $orderby.
     * @param value Value to set for the preferredDataLocation property.
     */
    public void setPreferredDataLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("preferredDataLocation", value);
    }
    /**
     * Sets the sensitivityLabelCount property value. The number of sensitivity labels applied to the group. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @param value Value to set for the sensitivityLabelCount property.
     */
    public void setSensitivityLabelCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("sensitivityLabelCount", value);
    }
    /**
     * Sets the servicePrincipalOwnerCount property value. The number of owners of the group that are service principals. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @param value Value to set for the servicePrincipalOwnerCount property.
     */
    public void setServicePrincipalOwnerCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("servicePrincipalOwnerCount", value);
    }
    /**
     * Sets the softDeletionDateTime property value. The date and time when the group was soft-deleted. If this property is empty, the group isn&apos;t soft-deleted. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @param value Value to set for the softDeletionDateTime property.
     */
    public void setSoftDeletionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("softDeletionDateTime", value);
    }
    /**
     * Sets the tenantId property value. The unique identifier of the tenant that the group belongs to. Supports $filter (eq, ne) and $orderby.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
    /**
     * Sets the transitiveServicePrincipalCount property value. The number of transitive members of the group that are service principals. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @param value Value to set for the transitiveServicePrincipalCount property.
     */
    public void setTransitiveServicePrincipalCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("transitiveServicePrincipalCount", value);
    }
    /**
     * Sets the transitiveUserCount property value. The total number of transitive user members of the group. Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @param value Value to set for the transitiveUserCount property.
     */
    public void setTransitiveUserCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("transitiveUserCount", value);
    }
}
